package com.wu.springframework.beans.factory;

import com.wu.springframework.beans.BeansException;

/**
 * @author: Lynn
 * @date: 2022/2/27
 */
public interface BeanFactory {

    Object getBean(String beanName) throws BeansException;

    Object getBean(String beanName, Object... args) throws BeansException;

    <T> T getBean(String beanName, Class<T> requiredType) throws BeansException;
}
