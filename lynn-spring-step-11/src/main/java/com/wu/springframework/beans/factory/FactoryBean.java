package com.wu.springframework.beans.factory;

/**
 * @author: Lynn
 * @date: 2022/3/13
 */
public interface FactoryBean<T> {

    T getObject() throws Exception;

    Class<?> getObjectType();

    boolean isSingleton();
}
