package com.cherryleer.rpc.demo.handler;

import com.cherryleer.rpc.demo.exception.ErrorCode;
import com.cherryleer.rpc.demo.model.MessageResponse;
import com.cherryleer.rpc.lnk.annotaion.LnkAbstractService;
import com.cherryleer.rpc.lnk.annotaion.LnkMethod;

/**
 * 消息响应处理器接口
 *
 * @author : cherryleer
 */
@LnkAbstractService
public interface MessageResponseHandler {
    /**
     * 发送成功
     */
    @LnkMethod(async = true)
    void onSuccess(MessageResponse messageResponse);

    /**
     * 发送失败
     */
    @LnkMethod(async = true)
    void onError(MessageResponse messageResponse, ErrorCode errorCode);
}
