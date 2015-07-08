package com.cherryleer.rpc.demo.client;

import com.cherryleer.rpc.demo.model.Message;

/**
 * 消息客户端
 *
 * @author : cherryleer
 */
public class DemoUpdateMessageClient extends AbstractDemoClient {

    public static void main(String[] args) throws InterruptedException {
        initClient();

        Message message = new Message(3, "update", "test");

        System.out.println("update method start, waiting for server to handle....");

        clientService.updateMessage(message);

        System.out.println("update method end.");
    }
}
