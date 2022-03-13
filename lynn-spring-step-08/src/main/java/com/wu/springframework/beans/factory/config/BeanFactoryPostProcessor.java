package com.wu.springframework.beans.factory.config;

import com.wu.springframework.beans.factory.ConfigurableListableBeanFactory;

/**
 * @author: Lynn
 * @date: 2022/3/12
 */
public interface BeanFactoryPostProcessor {

    void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory);
}
