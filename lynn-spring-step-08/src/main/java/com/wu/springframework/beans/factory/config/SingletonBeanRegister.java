package com.wu.springframework.beans.factory.config;

/**
 * @author: Lynn
 * @date: 2022/3/12
 */
public interface SingletonBeanRegister {

    Object getSingleton(String beanName);
}
