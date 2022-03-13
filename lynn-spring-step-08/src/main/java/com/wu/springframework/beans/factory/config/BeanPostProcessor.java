package com.wu.springframework.beans.factory.config;

import com.wu.springframework.beans.BeansException;

/**
 * @author: Lynn
 * @date: 2022/3/12
 */
public interface BeanPostProcessor {

    Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException;

    Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException;

}
