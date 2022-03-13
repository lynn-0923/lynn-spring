package com.wu.springframework.beans.factory.support;

import com.wu.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * @author: Lynn
 * @date: 2022/3/12
 */
public interface InstantiationStrategy {

    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor constructor, Object[] args);
}
