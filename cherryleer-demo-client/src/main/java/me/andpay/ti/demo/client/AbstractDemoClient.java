package me.andpay.ti.demo.client;

import me.andpay.ti.demo.service.MessageClientService;
import me.andpay.ti.demo.handler.MessageResponseHandler;
import me.andpay.ti.demo.util.SpringConfigUtil;
import org.springframework.context.support.AbstractApplicationContext;

/**
 * 抽象Client
 *
 * @author : cherryleer
 */
public class AbstractDemoClient {

    public static MessageClientService clientService;

    public static MessageResponseHandler responseHandler;

    public static void initClient() {
        AbstractApplicationContext context = SpringConfigUtil.initApplicationContext();
        clientService = SpringConfigUtil.getClientService(context);
        responseHandler = SpringConfigUtil.getResponseHandler(context);
    }


}
