package com.wu.springframework.beans.factory.config;

/**
 * @author wl
 * @date 2022/2/3
 */
public interface BeanDefinitionRegister {

    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
