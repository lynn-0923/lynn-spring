package com.wu.springframework.beans.factory.support;

import com.wu.springframework.beans.factory.config.BeanDefinition;

/**
 * @author wl
 * @date 2022/2/3
 */
public interface BeanDefinitionRegister {

    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
