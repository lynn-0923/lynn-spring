package com.wu.springframework.beans.factory;

/**
 * @author: Lynn
 * @date: 2022/3/12
 */
public interface BeanFactory {

    Object getBean(String beanName);

    Object getBean(String beanName, Object... args);

    <T> T getBean(String beanName, Class<T> requiredType);
}
