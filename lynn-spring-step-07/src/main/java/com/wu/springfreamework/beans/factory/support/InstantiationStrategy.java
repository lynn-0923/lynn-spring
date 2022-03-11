package com.wu.springfreamework.beans.factory.support;

import com.wu.springfreamework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * @author: Lynn
 * @date: 2022/3/10
 */
public interface InstantiationStrategy {

    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor constructor, Object[] args);
}
