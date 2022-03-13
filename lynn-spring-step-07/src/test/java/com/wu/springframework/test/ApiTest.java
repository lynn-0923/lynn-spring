package com.wu.springframework.test;

import com.wu.springframework.context.support.ClassPathXmlApplicationContext;
import com.wu.springframework.test.bean.UserService;
import org.junit.Test;

public class ApiTest {

    @Test
    public void test_xml1() {
        // 1.初始化 BeanFactory
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
        applicationContext.registerShutdownHook();

        // 2. 获取Bean对象调用方法
        UserService userService = applicationContext.getBean("userService", UserService.class);
        String result = userService.queryUserInfo();
        System.out.println("测试结果：" + result);
    }

    @Test
    public void test_hook() {
        Runtime.getRuntime().addShutdownHook(new Thread(() -> System.out.println("close！")));
    }

}
