package com.wu.springframework.beans.factory.support;

import com.wu.springframework.beans.BeansException;
import com.wu.springframework.beans.factory.config.BeanDefinition;

/**
 * @author wl
 * @date 2022/3/1
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory{

    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition, Object[] args) throws BeansException {
        return null;
    }
}
