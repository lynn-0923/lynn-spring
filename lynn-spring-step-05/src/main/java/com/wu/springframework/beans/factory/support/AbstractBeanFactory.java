package com.wu.springframework.beans.factory.support;

import com.wu.springframework.beans.BeansException;
import com.wu.springframework.beans.factory.BeanFactory;
import com.wu.springframework.beans.factory.config.BeanDefinition;

/**
 * @author wl
 * @date 2022/3/1
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegister implements BeanFactory {

    @Override
    public Object getBean(String beanName) throws BeansException {
        return doGetBean(beanName, null);
    }

    @Override
    public Object getBean(String beanName, Object... args) throws BeansException {
        return doGetBean(beanName, args);
    }

    @Override
    public <T> T getBean(String beanName, Class<T> requiredType) throws BeansException {
        return (T) getBean(beanName);
    }

    protected <T> T doGetBean(String beanName, final Object[] args) {
        final Object singleton = getSingleton(beanName);
        if (null != singleton) {
            return (T) singleton;
        }

        BeanDefinition beanDefinition = getBeanDefinition(beanName);
        return (T) createBean(beanName, beanDefinition, args);
    }

    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition, Object[] args) throws BeansException;
}
