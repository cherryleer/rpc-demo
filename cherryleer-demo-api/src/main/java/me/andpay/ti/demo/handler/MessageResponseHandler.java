package me.andpay.ti.demo.handler;

import me.andpay.ti.demo.model.MessageResponse;
import me.andpay.ti.lnk.annotaion.LnkAbstractService;
import me.andpay.ti.lnk.annotaion.LnkMethod;

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
    void onError(MessageResponse messageResponse);
}
