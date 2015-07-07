package me.andpay.ti.demo.client;

import me.andpay.ti.demo.model.Message;

/**
 * 消息客户端
 *
 * @author : cherryleer
 */
public class DemoAddMessageWithHandlerClient extends AbstractDemoClient {

    public static void main(String[] args) throws InterruptedException {
        initClient();

        Message message = Message.getDefaultMessageInstance();

        System.out.println("synchronized method start, waiting for server to handle....");

        clientService.addMessage(null, responseHandler);

        System.out.println("synchronized method end....");
    }
}
