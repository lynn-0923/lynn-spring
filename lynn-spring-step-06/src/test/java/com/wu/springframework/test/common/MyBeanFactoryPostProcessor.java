package com.wu.springframework.test.common;

import com.wu.springframework.beans.BeansException;
import com.wu.springframework.beans.PropertyValue;
import com.wu.springframework.beans.PropertyValues;
import com.wu.springframework.beans.factory.ConfigurableListableBeanFactory;
import com.wu.springframework.beans.factory.config.BeanDefinition;
import com.wu.springframework.beans.factory.config.BeanFactoryPostProcessor;

public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

        BeanDefinition beanDefinition = beanFactory.getBeanDefinition("userService");
        PropertyValues propertyValues = beanDefinition.getPropertyValues();

        propertyValues.addPropertyValue(new PropertyValue("company", "改为：字节跳动"));
    }

}
