package com.wu.springfreamework.beans.factory;

import com.wu.springfreamework.beans.BeansException;

import java.util.Map;

/**
 * @author: Lynn
 * @date: 2022/3/10
 */
public interface ListableBeanFactory extends BeanFactory {

    <T> Map<String, T> getBeansOfType(Class<T> type) throws BeansException;

    String[] getBeanDefinitionNames();
}
