package com.wu.springframework.beans.factory.config;

import com.wu.springframework.beans.factory.HierarchicalBeanFactory;

/**
 * @author: Lynn
 * @date: 2022/3/10
 */
public interface ConfigurableBeanFactory extends HierarchicalBeanFactory, SingletonBeanRegistry {

    String SCOPE_SINGLETON = "singleton";

    String SCOPE_PROTOTYPE = "prototype";

    void addBeanPostProcessor(BeanPostProcessor beanPostProcessor);

    /**
     * 销毁单例对象
     */
    void destroySingletons();

}