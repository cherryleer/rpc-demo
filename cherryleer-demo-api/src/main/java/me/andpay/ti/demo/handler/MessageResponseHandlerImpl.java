package me.andpay.ti.demo.handler;

import me.andpay.ti.demo.model.MessageResponse;
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
        logger.info("MessageResponseHandler: onSuccess, messageResponse is {}.", messageResponse);
    }

    @Override
    public void onError(MessageResponse messageResponse) {
        messageResponse.setCode(500);
        logger.info("MessageResponseHandler: onError, message is {}.", messageResponse);
    }
}
