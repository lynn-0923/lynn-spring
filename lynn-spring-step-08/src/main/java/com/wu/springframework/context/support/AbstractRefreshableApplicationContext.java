/**
 * Author:   Lynn
 * Date:     2022/3/12 19:37
 */
package com.wu.springframework.context.support;

import com.wu.springframework.beans.factory.ConfigurableListableBeanFactory;
import com.wu.springframework.beans.factory.support.DefaultListableBeanFactory;

/**
 * @author Lynn
 * @create 2022/3/12
 */
public abstract class AbstractRefreshableApplicationContext extends AbstractApplicationContext {

    private DefaultListableBeanFactory beanFactory;

    @Override
    protected ConfigurableListableBeanFactory getBeanFactory() {
        return beanFactory;
    }

    @Override
    protected void refreshBeanFactory() {
        DefaultListableBeanFactory beanFactory = createBeanFactory();
        loadBeanDefinitions(beanFactory);
        this.beanFactory = beanFactory;
    }

    protected abstract void loadBeanDefinitions(DefaultListableBeanFactory beanFactory);

    private DefaultListableBeanFactory createBeanFactory() {
        return new DefaultListableBeanFactory();
    }
}