package com.cherryleer.rpc.demo.service;


import com.cherryleer.rpc.daf.dao.QueryResult;
import com.cherryleer.rpc.demo.handler.MessageResponseHandler;
import com.cherryleer.rpc.demo.model.Message;
import com.cherryleer.rpc.demo.model.QueryMessageCond;

/**
 * 消息客户端服务
 *
 * @author : cherryleer
 */
public interface MessageClientService {

    void addMessage(Message message);

    /**
     * 添加消息，带有结果回调操作
     *
     * @param message 需要添加的消息实体
     * @param handler 消息回调处理类
     */
    void addMessage(Message message, MessageResponseHandler handler);

    /**
     * 通过主键删除消息
     *
     * @param id 需要删除的消息主键
     */
    void deleteMessage(int id);

    void updateMessage(Message message);

    /**
     * 通过主键获取消息
     *
     * @param id 需要获得的消息主键
     */
    Message getMessage(int id);

    /**
     * 分页查询消息
     *
     * @param cond 封装需要查询的条件
     * @param firstResult
     * @param maxResults
     * @return
     */
    QueryResult<Message> getMessages(QueryMessageCond cond, int firstResult, int maxResults);
}
