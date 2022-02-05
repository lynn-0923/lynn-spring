package com.wu.springframework.test;

import com.wu.springframework.beans.factory.config.BeanDefinition;
import com.wu.springframework.beans.factory.support.DefaultListableBeanFactory;
import com.wu.springframework.test.bean.UserService;
import org.junit.Test;

/**
 * @author wl
 * @date 2022/2/3
 */
public class ApiTest {

    @Test
    public void test_BeanFactory() {
        final DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        final BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        final UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();


        final UserService userService_Singleton = (UserService) beanFactory.getBean("userService");
        userService_Singleton.queryUserInfo();
    }
}
