/**
 * Author:   Lynn
 * Date:     2022/3/13 13:27
 */
package com.wu.springframework.beans.factory.config;

import com.wu.springframework.beans.factory.BeanFactory;

/**
 * @author Lynn
 * @create 2022/3/13
 */
public interface AutowireCapableBeanFactory extends BeanFactory {

    Object applyBeanPostProcessorsBeforeInitialization(Object bean, String beanName);

    Object applyBeanPostProcessorsAfterInitialization(Object bean, String beanName);

}