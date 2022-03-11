package com.wu.springfreamework.beans.factory.support;

import com.wu.springfreamework.beans.factory.config.BeanDefinition;
import com.wu.springfreamework.beans.factory.config.BeanPostProcessor;
import com.wu.springfreamework.beans.factory.config.ConfigurableBeanFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Lynn
 * @date: 2022/3/10
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegister implements ConfigurableBeanFactory {

    private List<BeanPostProcessor> beanPostProcessors = new ArrayList<>();

    @Override
    public void addBeanPostProcessor(BeanPostProcessor beanPostProcessor) {

    }

    @Override
    public Object getBean(String beanName) {
        return doGetBean(beanName, null);
    }

    @Override
    public Object getBean(String beanName, Object... args) {
        return doGetBean(beanName, args);
    }

    @Override
    public <T> T getBean(String beanName, Class<T> requiredType) {
        return (T) getBean(beanName);
    }

    private Object doGetBean(String beanName, Object[] args) {
        Object bean = getSingleton(beanName);
        if (null != bean) {
            return bean;
        }
        BeanDefinition beanDefinition = getBeanDefinition(beanName);

        return createBean(beanName, beanDefinition, args);
    }

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition, Object[] args);

    protected abstract BeanDefinition getBeanDefinition(String beanName);

    public List<BeanPostProcessor> getBeanPostProcessors() {
        return beanPostProcessors;
    }
}
