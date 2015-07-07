package me.andpay.ti.demo.client;

import me.andpay.ti.daf.dao.QueryResult;
import me.andpay.ti.demo.model.Message;
import me.andpay.ti.demo.model.QueryMessageCond;

/**
 * 消息客户端
 *
 * @author : cherryleer
 */
public class DemoGetMessageWithQueryResultClient extends AbstractDemoClient{

    public static void main(String[] args) throws InterruptedException {
        initClient();

        QueryMessageCond cond = new QueryMessageCond();
        cond.setTitle("default");

        System.out.println("synchronized method start, waiting for server to handle....");

        QueryResult<Message> results = clientService.getMessages(cond, 0, 3);

        System.out.println("synchronized method end.");

        for (Message message : results.getElements()) {
            System.out.println("Message result :" + message);
        }
    }
}
