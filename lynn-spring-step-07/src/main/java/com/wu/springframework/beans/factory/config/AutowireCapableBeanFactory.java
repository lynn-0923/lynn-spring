package com.wu.springframework.beans.factory.config;

import com.wu.springframework.beans.factory.BeanFactory;

/**
 * @author: Lynn
 * @date: 2022/3/10
 */
public interface AutowireCapableBeanFactory extends BeanFactory {

    Object applyBeanPostProcessorsBeforeInitialization(Object existingBean, String beanName);

    Object applyBeanPostProcessorsAfterInitialization(Object existingBean, String beanName);
}
