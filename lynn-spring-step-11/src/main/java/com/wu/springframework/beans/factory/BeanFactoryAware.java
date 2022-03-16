package com.wu.springframework.beans.factory;

import com.wu.springframework.beans.BeansException;

/**
 * @author: Lynn
 * @date: 2022/3/13
 */
public interface BeanFactoryAware extends Aware {
    void setBeanFactory(BeanFactory beanFactory) throws BeansException;

}
