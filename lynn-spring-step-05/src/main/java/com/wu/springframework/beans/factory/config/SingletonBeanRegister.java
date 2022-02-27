package com.wu.springframework.beans.factory.config;

/**
 * @author: Lynn
 * @date: 2022/2/28
 */
public interface SingletonBeanRegister {

    Object getSingleton(String beanName);

}
