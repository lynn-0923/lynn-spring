package com.wu.springframework.beans.factory;

import java.util.Map;

/**
 * @author: Lynn
 * @date: 2022/3/13
 */
public interface ListableBeanFactory extends BeanFactory {

    <T> Map<String, T> getBeansOfType(Class<T> type);

    String[] getBeanDefinitionNames();
}
