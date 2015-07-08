package com.cherryleer.rpc.demo.server;

import com.cherryleer.rpc.demo.util.SpringConfigUtil;

/**
 * 消息服务端
 *
 * @author : cherryleer
 */
public class ServerMain {

    public static void main(String[] args) throws InterruptedException {
        SpringConfigUtil.initApplicationContext();

        System.out.println("cherryleer demo ServerMain start!");

        while (true) {
            System.out.println("cherryleer demo ServerMain running....");
            Thread.sleep(60 * 1000);
        }
    }
}
