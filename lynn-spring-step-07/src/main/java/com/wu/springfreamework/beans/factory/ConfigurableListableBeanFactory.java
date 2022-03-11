package com.wu.springfreamework.beans.factory;

import com.wu.springfreamework.beans.factory.config.AutowireCapableBeanFactory;
import com.wu.springfreamework.beans.factory.config.BeanDefinition;
import com.wu.springfreamework.beans.factory.config.BeanPostProcessor;
import com.wu.springfreamework.beans.factory.config.ConfigurableBeanFactory;

/**
 * @author: Lynn
 * @date: 2022/3/10
 */
public interface ConfigurableListableBeanFactory extends ListableBeanFactory, AutowireCapableBeanFactory, ConfigurableBeanFactory {

    BeanDefinition getBeanDefinition(String beanName);

    void preInstantiateSingleton();

    void addBeanPostProcessor(BeanPostProcessor beanPostProcessor);

}
