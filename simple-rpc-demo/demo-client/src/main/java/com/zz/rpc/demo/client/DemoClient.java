package com.zz.rpc.demo.client;

import com.zz.rpc.demo.api.HelloService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoClient {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        HelloService helloService = applicationContext.getBean(HelloService.class);
        for (int i = 0; i < 10; i++) {
            System.out.println(helloService.hello("abc" + i));
        }
    }
}
