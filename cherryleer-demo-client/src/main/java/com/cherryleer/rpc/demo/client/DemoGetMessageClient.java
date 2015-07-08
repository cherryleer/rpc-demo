package com.cherryleer.rpc.demo.client;

import com.cherryleer.rpc.demo.model.Message;


/**
 * 消息客户端
 *
 * @author : cherryleer
 */
public class DemoGetMessageClient extends AbstractDemoClient {

    public static void main(String[] args) throws InterruptedException {
        initClient();

        // 同步方法开始，等待服务器端处理后才能继续往下
        System.out.println("synchronized method start, waiting for server to handle....");

        Message result = clientService.getMessage(0);

        // 同步方法结束
        System.out.println("synchronized method end, result is " + result + ".");
    }
}
