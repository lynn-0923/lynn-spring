/**
 * Author:   Lynn
 * Date:     2022/3/12 19:37
 */
package com.wu.springframework.context.support;

import com.wu.springframework.beans.BeansException;
import com.wu.springframework.beans.factory.config.BeanPostProcessor;
import com.wu.springframework.context.ApplicationContext;
import com.wu.springframework.context.ApplicationContextAware;

/**
 * @author Lynn
 * @create 2022/3/12
 */
public class ApplicationContextAwareProcessor implements BeanPostProcessor {

    private ApplicationContext applicationContext;

    public ApplicationContextAwareProcessor(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof ApplicationContextAware) {
            ((ApplicationContextAware) bean).setApplicationContext(applicationContext);
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }
}