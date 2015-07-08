package com.cherryleer.rpc.demo.handler;

import com.cherryleer.rpc.demo.exception.ErrorCode;
import com.cherryleer.rpc.demo.model.MessageResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 消息响应处理器实现
 *
 * @author : cherryleer
 */
public class MessageResponseHandlerImpl implements MessageResponseHandler {

    Logger logger = LoggerFactory.getLogger(MessageResponseHandlerImpl.class);

    @Override
    public void onSuccess(MessageResponse messageResponse) {
        messageResponse.setCode(200);
        messageResponse.setMsg("OK");
        logger.info("MessageResponseHandler: onSuccess, messageResponse is {}.", messageResponse);

        System.out.println("MessageResponseHandler on success, response is " + messageResponse);
    }

    @Override
    public void onError(MessageResponse messageResponse, ErrorCode errorCode) {
        messageResponse.setCode(errorCode.getCode());
        messageResponse.setMsg(errorCode.getDescription());
        logger.info("MessageResponseHandler: onError, message is {}.", messageResponse);

        System.out.println("MessageResponseHandler on error, response is " + messageResponse);
    }
}
