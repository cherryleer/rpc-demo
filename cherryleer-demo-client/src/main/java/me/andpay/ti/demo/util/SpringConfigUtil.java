package me.andpay.ti.demo.util;

import me.andpay.ti.demo.service.MessageClientService;
import me.andpay.ti.demo.handler.MessageResponseHandler;
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
