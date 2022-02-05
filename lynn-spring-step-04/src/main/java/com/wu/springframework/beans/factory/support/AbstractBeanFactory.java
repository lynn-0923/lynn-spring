package com.wu.springframework.beans.factory.support;

import com.wu.springframework.beans.BeansException;
import com.wu.springframework.beans.factory.BeanFactory;
import com.wu.springframework.beans.factory.config.BeanDefinition;

/**
 * @author wl
 * @date 2022/2/3
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

    protected Object doGetBean(final String beanName, final Object... args) throws BeansException {
        final Object bean = getSingleton(beanName);
        if (null != bean) {
            return bean;
        }

        final BeanDefinition beanDefinition = getBeanDefinition(beanName);

        return createBean(beanName, beanDefinition, args);
    }

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition, Object[] args);

    protected abstract BeanDefinition getBeanDefinition(String beanName);
}
