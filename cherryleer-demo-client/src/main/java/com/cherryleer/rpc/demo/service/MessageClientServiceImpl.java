package com.cherryleer.rpc.demo.service;

import com.cherryleer.rpc.daf.dao.QueryResult;
import com.cherryleer.rpc.demo.handler.MessageResponseHandler;
import com.cherryleer.rpc.demo.model.Message;
import com.cherryleer.rpc.demo.model.QueryMessageCond;
import com.cherryleer.rpc.lnk.annotaion.Lnkwired;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 消息客户端服务实现
 *
 * @author : cherryleer
 */
public class MessageClientServiceImpl implements MessageClientService {

    Logger logger = LoggerFactory.getLogger(MessageClientServiceImpl.class);

    @Lnkwired
    private MessageService messageService;

    @Override
    public void addMessage(Message message) {
        logger.info("MessageClientService:send message without handler, message : {}", message);
        messageService.addMessage(message);
    }

    @Override
    public void addMessage(Message message, MessageResponseHandler handler) {
        logger.info("MessageClientService:send message without handler, message : {}", message);
        messageService.addMessage(message, handler);
    }

    @Override
    public void deleteMessage(int id) {
        messageService.deleteMessage(id);
    }

    @Override
    public void updateMessage(Message message) {
        messageService.updateMessage(message);
    }

    public Message getMessage(int id) {
        Message message = messageService.getMessage(id);
        logger.info("MessageClientService:get message {} by id {}. ", message, id);
        return message;
    }

    @Override
    public QueryResult<Message> getMessages(QueryMessageCond cond, int firstResult, int maxResults) {
        return messageService.getMessages(cond, firstResult, maxResults);
    }
}
