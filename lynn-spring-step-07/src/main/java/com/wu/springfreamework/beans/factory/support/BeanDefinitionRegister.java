package com.wu.springfreamework.beans.factory.support;

import com.wu.springfreamework.beans.BeansException;
import com.wu.springfreamework.beans.factory.config.BeanDefinition;

import java.beans.Beans;

/**
 * @author: Lynn
 * @date: 2022/3/10
 */
public interface BeanDefinitionRegister {

    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);

    BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    boolean containsBeanDefinition(String beanName);

    String[] getBeanDefinitionName();
}
