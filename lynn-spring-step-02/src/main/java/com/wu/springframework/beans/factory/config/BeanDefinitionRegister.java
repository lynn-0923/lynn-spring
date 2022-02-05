package com.wu.springframework.beans.factory.config;

/**
 * @author wl
 * @date 2022/2/3
 */
public interface BeanDefinitionRegister {

    /**
     * 注册bean信息
     *
     * @param beanName
     * @param beanDefinition
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
