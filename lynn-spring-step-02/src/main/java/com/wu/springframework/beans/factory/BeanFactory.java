package com.wu.springframework.beans.factory;

import com.wu.springframework.beans.BeansException;

/**
 * @author wl
 * @date 2022/2/3
 */
public interface BeanFactory {

    /**
     * 获取bean
     *
     * @param beanName
     * @return
     * @throws BeansException
     */
    Object getBean(String beanName) throws BeansException;
}
