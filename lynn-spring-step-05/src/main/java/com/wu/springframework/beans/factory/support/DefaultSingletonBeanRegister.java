package com.wu.springframework.beans.factory.support;

import com.wu.springframework.beans.factory.config.SingletonBeanRegister;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @author wl
 * @date 2022/3/1
 */
public class DefaultSingletonBeanRegister implements SingletonBeanRegister {

    Map<String, Object> singletonObjects = new HashMap<>();

    @Override
    public Object getSingleton(String beanName) {
        return singletonObjects.get(beanName);
    }

    protected void addSingleton(String beanName, Object singletonObject) {
        singletonObjects.put(beanName, singletonObject);
    }
}
