package com.wu.springframework.beans.factory;

import com.wu.springframework.beans.BeansException;
import com.wu.springframework.beans.factory.config.AutowireCapableBeanFactory;
import com.wu.springframework.beans.factory.config.BeanDefinition;
import com.wu.springframework.beans.factory.config.BeanPostProcessor;
import com.wu.springframework.beans.factory.config.ConfigurableBeanFactory;

/**
 * @author: Lynn
 * @date: 2022/3/6
 */
public interface ConfigurableListableBeanFactory extends ListableBeanFactory, ConfigurableBeanFactory, AutowireCapableBeanFactory {

    BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    void preInstantiateSingletons() throws BeansException;

    void addBeanPostProcessor(BeanPostProcessor beanPostProcessor);

}
