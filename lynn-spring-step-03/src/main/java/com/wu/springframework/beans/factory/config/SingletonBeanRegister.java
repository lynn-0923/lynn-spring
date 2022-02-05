package com.wu.springframework.beans.factory.config;

/**
 * @author wl
 * @date 2022/2/3
 */
public interface SingletonBeanRegister {

    Object getSingleton(String beanName);
}
