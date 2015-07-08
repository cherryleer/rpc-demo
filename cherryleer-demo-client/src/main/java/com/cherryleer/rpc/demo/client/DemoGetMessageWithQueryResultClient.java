package com.cherryleer.rpc.demo.client;

import com.cherryleer.rpc.daf.dao.QueryResult;
import com.cherryleer.rpc.demo.model.Message;
import com.cherryleer.rpc.demo.model.QueryMessageCond;

import java.util.Date;

/**
 * 消息客户端
 *
 * @author : cherryleer
 */
public class DemoGetMessageWithQueryResultClient extends AbstractDemoClient{

    private static long DATE_JULY_THIRD_NOON = 1435896000000l;

    public static void main(String[] args) throws InterruptedException {
        initClient();

        QueryMessageCond cond = new QueryMessageCond();
        cond.setTitle("default");
        cond.setStartCreateTime(new Date(DATE_JULY_THIRD_NOON));

        System.out.println("synchronized method start, waiting for server to handle....");

        QueryResult<Message> results = clientService.getMessages(cond, 0, 10);

        System.out.println("synchronized method end.");

        for (Message message : results.getElements()) {
            System.out.println("Message result :" + message);
        }
    }
}
