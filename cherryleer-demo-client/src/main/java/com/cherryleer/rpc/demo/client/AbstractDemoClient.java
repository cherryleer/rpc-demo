package com.cherryleer.rpc.demo.client;

import com.cherryleer.rpc.demo.handler.MessageResponseHandler;
import com.cherryleer.rpc.demo.service.MessageClientService;
import com.cherryleer.rpc.demo.util.SpringConfigUtil;
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
