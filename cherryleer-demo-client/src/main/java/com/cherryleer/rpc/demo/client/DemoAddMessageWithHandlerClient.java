package com.cherryleer.rpc.demo.client;

import com.cherryleer.rpc.demo.model.Message;

import java.util.Date;

/**
 * 消息客户端
 *
 * @author : cherryleer
 */
public class DemoAddMessageWithHandlerClient extends AbstractDemoClient {

    public static void main(String[] args) throws InterruptedException {
        initClient();

        Message message = Message.getDefaultMessageInstance();

        message.setCreateTime(new Date());

        System.out.println("success add demo start, waiting for server to handle....");

        clientService.addMessage(message, responseHandler);

        System.out.println("add message null fail demo start, waiting for server to handle....");

        clientService.addMessage(null, responseHandler);
    }
}
