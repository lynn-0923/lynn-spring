/**
 * Author:   Lynn
 * Date:     2022/3/13 13:35
 */
package com.wu.springframework.context.support;

import com.wu.springframework.beans.BeansException;
import com.wu.springframework.beans.factory.ConfigurableListableBeanFactory;
import com.wu.springframework.beans.factory.support.DefaultListableBeanFactory;

/**
 * @author Lynn
 * @create 2022/3/13
 */
public abstract class AbstractRefreshableApplicationContext extends AbstractApplicationContext {

    private DefaultListableBeanFactory beanFactory;

    @Override
    protected void refreshBeanFactory() throws BeansException {
        DefaultListableBeanFactory beanFactory = createBeanFactory();
        loadBeanDefinitions(beanFactory);
        this.beanFactory = beanFactory;
    }

    private DefaultListableBeanFactory createBeanFactory() {
        return new DefaultListableBeanFactory();
    }

    protected abstract void loadBeanDefinitions(DefaultListableBeanFactory beanFactory);

    @Override
    protected ConfigurableListableBeanFactory getBeanFactory() {
        return beanFactory;
    }
}