package com.wu.springframework.test;

import com.wu.springframework.beans.PropertyValue;
import com.wu.springframework.beans.PropertyValues;
import com.wu.springframework.beans.factory.config.BeanDefinition;
import com.wu.springframework.beans.factory.config.BeanReference;
import com.wu.springframework.beans.factory.support.DefaultListableBeanFactory;
import com.wu.springframework.test.bean.UserDao;
import com.wu.springframework.test.bean.UserService;
import org.junit.Test;

/**
 * @author wl
 * @date 2022/2/4
 */
public class ApiTest {

    @Test
    public void test_BeanFactory() {
        // 初始化 BeanFactory
        final DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        // userDao 注册
        beanFactory.registerBeanDefinition("userDao", new BeanDefinition(UserDao.class));

        // userService 设置输赢[uId, userDao]
        final PropertyValues propertyValues = new PropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("uId", "10001"));
        propertyValues.addPropertyValue(new PropertyValue("userDao", new BeanReference("userDao")));

        // userService 注入bean
        beanFactory.registerBeanDefinition("userService", new BeanDefinition(UserService.class, propertyValues));

        // userService 获取bean
        final UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
    }
}
