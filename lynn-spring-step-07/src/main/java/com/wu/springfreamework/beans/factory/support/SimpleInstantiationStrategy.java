/**
 * Author:   Lynn
 * Date:     2022/3/10 23:40
 */
package com.wu.springfreamework.beans.factory.support;

import com.wu.springfreamework.beans.BeansException;
import com.wu.springfreamework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * @author Lynn
 * @create 2022/3/10
 */
public class SimpleInstantiationStrategy implements InstantiationStrategy {

    @Override
    public Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor constructor, Object[] args) {
        Class beanClass = beanDefinition.getBeanClass();
        try {
            if (null != constructor) {
                return beanClass.getDeclaredConstructor(constructor.getParameterTypes()).newInstance(args);
            } else {
                return beanClass.getDeclaredConstructor().newInstance();
            }

        } catch (Throwable e) {
            throw new BeansException("Failed to instantiate [" + beanClass.getName() + "]", e);
        }
    }
}