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
public class DefaultListableBeanFactory extends AbstractAutowireBeanFactory implements BeanDefinitionRegister {

    private final Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();

    @Override
    protected BeanDefinition getBeanDefinition(String beanName) {
        final BeanDefinition beanDefinition = beanDefinitionMap.get(beanName);
        if (beanDefinition == null) throw new BeansException("No bean named '" + beanName + "' is defined");
        return beanDefinition;
    }


    @Override
    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(beanName, beanDefinition);
    }
}
