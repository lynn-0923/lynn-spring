/**
 * Author:   Lynn
 * Date:     2022/3/10 23:17
 */
package com.wu.springfreamework.beans.factory.config;

import com.wu.springfreamework.beans.BeansException;

/**
 * @author Lynn
 * @create 2022/3/10
 */
public interface BeanPostProcessor {

    /**
     * 在 Bean 对象执行初始化方法之前，执行此方法
     *
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException;

    /**
     * 在 Bean 对象执行初始化方法之后，执行此方法
     *
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException;

}