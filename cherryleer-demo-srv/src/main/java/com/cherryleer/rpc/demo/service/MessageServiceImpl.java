package com.cherryleer.rpc.demo.service;

import com.cherryleer.rpc.daf.dao.QueryResult;
import com.cherryleer.rpc.demo.dao.MessageDao;
import com.cherryleer.rpc.demo.exception.ErrorCode;
import com.cherryleer.rpc.demo.exception.ParamNullException;
import com.cherryleer.rpc.demo.handler.MessageResponseHandler;
import com.cherryleer.rpc.demo.model.Message;
import com.cherryleer.rpc.demo.model.MessageResponse;
import com.cherryleer.rpc.demo.model.QueryMessageCond;
import com.cherryleer.rpc.demo.util.ParamVerifyUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

/**
 * 消息服务端服务实现
 *
 * @author : cherryleer
 */
public class MessageServiceImpl implements MessageService {

    private Logger logger = LoggerFactory.getLogger(MessageServiceImpl.class);

    private MessageDao messageDao;

    @Override
    public void addMessage(Message message) throws ParamNullException {
        logger.info("MessageService: addMessage {} without handler.", message);

        ParamVerifyUtil.verifyMessageNull(message);

        messageDao.add(message);
    }

    @Override
    public void addMessage(Message message, MessageResponseHandler handler) {
        logger.info("MessageService: sendMessage {} with handler.", message);
        MessageResponse messageResponse = new MessageResponse(message);

        try {
            ParamVerifyUtil.verifyMessageNull(message);

            Integer result = messageDao.add(message);
            boolean sendSuccess = result != null;

            if (sendSuccess)
                handler.onSuccess(messageResponse);
            else
                handler.onError(messageResponse, ErrorCode.ADD_MESSAGE_ERROR);

        } catch (ParamNullException e) {
            handler.onError(messageResponse, ErrorCode.SYSTEM_ERROR);
        }

    }

    @Override
    public void deleteMessage(int id) {
        logger.info("MessageService: deleteMessage, message id is {}.", id);

        ParamVerifyUtil.verifyIntegerNegative(id);

        messageDao.delete(id);
    }

    @Override
    public void updateMessage(Message message) {
        logger.info("MessageService: updateMessage {}.", message);

        ParamVerifyUtil.verifyMessageNull(message);

        message.setUpdateTime(new Date());

        messageDao.update(message);
    }

    @Override
    public QueryResult<Message> getMessages(QueryMessageCond cond, int firstResult, int maxResults) {
        logger.info("MessageService: getMessage by condition {}.", cond);

        ParamVerifyUtil.verifyMessageNull(cond);

        return messageDao.queryForResult(cond, firstResult, maxResults);
    }

    @Override
    public Message getMessage(int id) {
        logger.info("MessageService: getMessage by id {}.", id);

        ParamVerifyUtil.verifyIntegerNegative(id);

        Message message = messageDao.get(id);
        return message;
    }

    @Autowired
    public void setMessageDao(MessageDao messageDao) {
        this.messageDao = messageDao;
    }
}
