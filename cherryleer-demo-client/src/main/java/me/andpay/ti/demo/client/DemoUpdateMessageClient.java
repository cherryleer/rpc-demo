package me.andpay.ti.demo.client;

import me.andpay.ti.demo.service.MessageClientService;
import me.andpay.ti.demo.model.Message;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by cherryleer on 15/7/6.
 */
public class DemoUpdateMessageClient {

    public static void main(String[] args) throws InterruptedException {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"spring-config/cherryleer-demo-client-config.xml"});
        context.registerShutdownHook();

        System.out.println("cherryleer demo client start!");

        MessageClientService clientService = (MessageClientService) context.getBean("messageClientService");

        Message message = new Message(3, "test", "test");

        // 同步方法开始，等待服务器端处理后才能继续往下
        System.out.println("synchronized method start, waiting for server to handle....");

        clientService.updateMessage(message);

        // 同步方法结束
        System.out.println("synchronized method end.");
    }
}
