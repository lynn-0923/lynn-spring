/**
 * Author:   Lynn
 * Date:     2022/3/6 16:49
 */
package com.wu.springframework.beans.factory;

import com.wu.springframework.beans.BeansException;

import java.util.Objects;

/**
 * @author Lynn
 * @create 2022/3/6
 */
public interface BeanFactory {

    Object getBean(String beanName) throws BeansException;

    Object getBean(String beanName, Object... args) throws BeansException;

    <T> T getBean(String beanName, Class<T> requiredType) throws BeansException;
}