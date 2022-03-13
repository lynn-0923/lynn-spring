/**
 * Author:   Lynn
 * Date:     2022/3/13 13:27
 */
package com.wu.springframework.beans.factory.config;

/**
 * @author Lynn
 * @create 2022/3/13
 */
public interface BeanPostProcessor {

    Object postProcessBeforeInitialization(Object bean, String beanName);

    Object postProcessAfterInitialization(Object bean, String beanName);
}