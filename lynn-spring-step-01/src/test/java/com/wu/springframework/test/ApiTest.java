package com.wu.springframework.test;

import com.wu.springframework.BeanDefinition;
import com.wu.springframework.BeanFactory;
import com.wu.springframework.test.bean.UserService;
import org.junit.Test;

/**
 * @author wl
 * @date 2022/2/3
 */
public class ApiTest {

    @Test
    public void testBean() {
        final BeanFactory beanFactory = new BeanFactory();

        final BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        final UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();

    }
}
