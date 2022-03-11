package com.wu.springfreamework.beans.factory.config;

import com.wu.springfreamework.beans.factory.ConfigurableListableBeanFactory;

/**
 * @author: Lynn
 * @date: 2022/3/10
 */
public interface BeanFactoryPostProcessor {

    void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory);
}
