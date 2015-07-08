package com.cherryleer.rpc.demo.client;

import com.cherryleer.rpc.demo.model.Message;

/**
 * 消息客户端
 *
 * @author : cherryleer
 */
public class DemoAddMessageClient extends AbstractDemoClient {

    public static void main(String[] args) throws InterruptedException {
        initClient();

        Message message = Message.getDefaultMessageInstance();

        System.out.println("synchronized method start, waiting for server to handle....");

        clientService.addMessage(message);

        System.out.println("synchronized method end....");
    }
}
