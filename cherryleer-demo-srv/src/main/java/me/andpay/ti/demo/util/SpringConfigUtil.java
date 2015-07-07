package me.andpay.ti.demo.util;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Spring配置工具类
 *
 * @author : cherryleer
 */
public class SpringConfigUtil {

    public static void initApplicationContext() {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"spring-config/cherryleer-demo-server-config.xml"});
        context.registerShutdownHook();
    }
}
