package com.cherryleer.rpc.demo.service;

import com.cherryleer.rpc.daf.dao.QueryResult;
import com.cherryleer.rpc.demo.ServiceGroups;
import com.cherryleer.rpc.demo.exception.ParamNullException;
import com.cherryleer.rpc.demo.handler.MessageResponseHandler;
import com.cherryleer.rpc.demo.model.Message;
import com.cherryleer.rpc.demo.model.QueryMessageCond;
import com.cherryleer.rpc.lnk.annotaion.Callback;
import com.cherryleer.rpc.lnk.annotaion.LnkMethod;
import com.cherryleer.rpc.lnk.annotaion.LnkService;

/**
 * 消息服务端服务
 *
 * @author : cherryleer
 */
@LnkService(serviceGroup = ServiceGroups.CHERRYLEER_DEMO_SRV)
public interface MessageService {

    @LnkMethod
    void addMessage(Message message) throws ParamNullException;

    /**
     * 添加消息，带有结果回调操作
     *
     * @param message 需要添加的消息实体
     * @param handler 消息回调处理类
     */
    @LnkMethod(async = true)
    void addMessage(Message message, @Callback MessageResponseHandler handler);

    /**
     * 通过主键删除消息
     *
     * @param id 需要删除的消息主键
     */
    @LnkMethod
    void deleteMessage(int id);

    @LnkMethod(async = true)
    void updateMessage(Message message);

    /**
     * 通过主键获取消息
     *
     * @param id 需要获得的消息主键
     */
    @LnkMethod
    Message getMessage(int id);

    /**
     * 分页查询消息
     *
     * @param cond 封装需要查询的条件
     * @param firstResult
     * @param maxResults
     * @return
     */
    @LnkMethod
    QueryResult<Message> getMessages(QueryMessageCond cond, int firstResult, int maxResults);

}
