package com.wu.springframework.beans.factory.support;

import com.wu.springframework.beans.BeansException;
import com.wu.springframework.beans.factory.config.BeanDefinition;
import com.wu.springframework.beans.factory.config.BeanDefinitionRegister;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author wl
 * @date 2022/2/3
 */
public class DefaultListableBeanFactory
        extends AbstractAutowireCapableBeanFactory implements BeanDefinitionRegister {

    private Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();

    @Override
    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(beanName, beanDefinition);
    }

    @Override
    protected BeanDefinition getBeanDefinition(String beanName) throws BeansException {
        final BeanDefinition beanDefinition = beanDefinitionMap.get(beanName);
        if (null == beanDefinition) throw new BeansException("No bean named '" + beanName + "' is defined");

        return beanDefinition;
    }
}
