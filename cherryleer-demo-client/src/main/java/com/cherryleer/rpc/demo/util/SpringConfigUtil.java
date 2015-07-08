package com.cherryleer.rpc.demo.util;

import com.cherryleer.rpc.demo.handler.MessageResponseHandler;
import com.cherryleer.rpc.demo.service.MessageClientService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Spring配置工具类
 *
 * @author : cherryleer
 */
public class SpringConfigUtil {

    public static AbstractApplicationContext initApplicationContext() {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"spring-config/cherryleer-demo-client-config.xml"});
        context.registerShutdownHook();
        return context;
    }

    public static MessageClientService getClientService(ApplicationContext applicationContext) {
        return (MessageClientService) applicationContext.getBean("messageClientService");
    }

    public static MessageResponseHandler getResponseHandler(ApplicationContext applicationContext) {
        return (MessageResponseHandler) applicationContext.getBean("messageResponseHandler");
    }
}
