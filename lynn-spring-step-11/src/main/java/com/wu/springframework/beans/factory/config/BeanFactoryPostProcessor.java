/**
 * Author:   Lynn
 * Date:     2022/3/13 13:26
 */
package com.wu.springframework.beans.factory.config;

import com.wu.springframework.beans.factory.ConfigurableListableBeanFactory;

/**
 * @author Lynn
 * @create 2022/3/13
 */
public interface BeanFactoryPostProcessor {

    void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory);

}