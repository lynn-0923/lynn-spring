package com.wu.springframework.beans.factory.config;

import com.wu.springframework.beans.factory.BeanFactory;

/**
 * @author: Lynn
 * @date: 2022/3/12
 */
public interface AutowireCapableBeanFactory extends BeanFactory {

    Object applyBeanPostProcessorsBeforeInitialization(Object bean, String beanName);

    Object applyBeanPostProcessorsAfterInitialization(Object bean, String beanName);

}
