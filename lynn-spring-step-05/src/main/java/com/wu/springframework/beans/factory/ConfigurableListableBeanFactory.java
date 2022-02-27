/**
 * Author:   Lynn
 * Date:     2022/2/28 0:20
 */
package com.wu.springframework.beans.factory;

import com.wu.springframework.beans.BeansException;
import com.wu.springframework.beans.factory.config.AutowireCapableBeanFactory;
import com.wu.springframework.beans.factory.config.BeanDefinition;
import com.wu.springframework.beans.factory.config.ConfigurableBeanFactory;

/**
 * @author Lynn
 * @create 2022/2/28
 */
public interface ConfigurableListableBeanFactory extends ListableBeanFactory, AutowireCapableBeanFactory, ConfigurableBeanFactory {

    BeanDefinition getBeanDefinition(String beanName) throws BeansException;

}