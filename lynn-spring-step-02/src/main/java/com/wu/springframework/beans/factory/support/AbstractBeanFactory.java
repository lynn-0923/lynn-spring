package com.wu.springframework.beans.factory.support;

import com.wu.springframework.beans.BeansException;
import com.wu.springframework.beans.factory.BeanFactory;
import com.wu.springframework.beans.factory.config.BeanDefinition;

/**
 * @author wl
 * @date 2022/2/3
 */
public abstract class AbstractBeanFactory
        extends DefaultSingletonBeanRegister implements BeanFactory {

    @Override
    public Object getBean(String beanName) throws BeansException {
        final Object bean = getSingleton(beanName);
        if (null != bean) {
            return bean;
        }

        BeanDefinition beanDefinition = getBeanDefinition(beanName);

        return createBean(beanName, beanDefinition);
    }

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException;

    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;

}
