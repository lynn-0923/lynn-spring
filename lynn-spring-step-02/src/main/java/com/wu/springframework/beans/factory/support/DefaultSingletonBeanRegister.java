package com.wu.springframework.beans.factory.support;

import com.wu.springframework.beans.factory.config.SingletonBeanRegister;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author wl
 * @date 2022/2/3
 */
public class DefaultSingletonBeanRegister implements SingletonBeanRegister {

    private final Map<String, Object> singletonObject = new ConcurrentHashMap<>();

    @Override
    public Object getSingleton(String beanName) {
        return singletonObject.get(beanName);
    }

    protected void addSingleton(String beanName, Object bean) {
        singletonObject.put(beanName, bean);
    }
}
