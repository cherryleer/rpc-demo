package com.cherryleer.rpc.demo.client;


/**
 * 消息客户端
 *
 * @author : cherryleer
 */
public class DemoDeleteMessageClient extends AbstractDemoClient {

    public static void main(String[] args) throws InterruptedException {
        initClient();

        // 同步方法开始，等待服务器端处理后才能继续往下
        System.out.println("synchronized method start, waiting for server to handle....");

        clientService.deleteMessage(2);

        // 同步方法结束
        System.out.println("synchronized method end....");
    }
}
