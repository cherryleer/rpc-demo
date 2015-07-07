package me.andpay.ti.demo.service;

import me.andpay.ti.daf.dao.QueryResult;
import me.andpay.ti.demo.dao.MessageDao;
import me.andpay.ti.demo.exception.ParamNullException;
import me.andpay.ti.demo.handler.MessageResponseHandler;
import me.andpay.ti.demo.model.Message;
import me.andpay.ti.demo.model.MessageResponse;
import me.andpay.ti.demo.model.QueryMessageCond;
import me.andpay.ti.demo.util.ParamVerifyUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

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

        ParamVerifyUtil.verifyMessageNull(message);

        Integer result = messageDao.add(message);

        boolean sendSuccess = result == null;
        MessageResponse messageResponse = new MessageResponse(message);

        if (sendSuccess)
            handler.onSuccess(messageResponse);
        else
            handler.onError(messageResponse);
    }

    @Override
    public void deleteMessage(int id) {
        logger.info("MessageService: deleteMessage, message id is {}." , id);

        ParamVerifyUtil.verifyIntegerNegative(id);

        messageDao.delete(id);
    }

    @Override
    public void updateMessage(Message message) {
        logger.info("MessageService: updateMessage {}.", message);

        ParamVerifyUtil.verifyMessageNull(message);

        messageDao.update(message);
    }

    @Override
    public QueryResult<Message> getMessages(QueryMessageCond cond, int firstResult, int maxResults) {
        logger.info("MessageService: getMessage by condition {}." , cond);

        ParamVerifyUtil.verifyMessageNull(cond);

        return messageDao.queryForResult(cond,firstResult,maxResults);
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
