package com.wu.springfreamework.beans.factory.config;

import com.wu.springfreamework.beans.factory.BeanFactory;

/**
 * @author: Lynn
 * @date: 2022/3/10
 */
public interface AutowireCapableBeanFactory extends BeanFactory {

    Object applyBeanFactoryProcessorsBeforeInitiation(Object existingBean, String beanName);

    Object applyBeanFactoryProcessorsAfterInitiation(Object existingBean, String beanName);
}
