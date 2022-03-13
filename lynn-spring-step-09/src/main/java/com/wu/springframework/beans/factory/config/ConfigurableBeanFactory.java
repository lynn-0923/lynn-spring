package com.wu.springframework.beans.factory.config;

import com.wu.springframework.beans.factory.HierarchicalBeanFactory;

/**
 * @author: Lynn
 * @date: 2022/3/13
 */
public interface ConfigurableBeanFactory extends HierarchicalBeanFactory, SingletonBeanRegister {

    String SCOPE_SINGLETON = "singleton";

    String SCOPE_PROTOTYPE = "prototype";

    void addBeanPostProcessor(BeanPostProcessor beanPostProcessor);

    void destroySingletons();
}
