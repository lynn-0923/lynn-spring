/**
 * Author:   Lynn
 * Date:     2022/3/6 18:17
 */
package com.wu.springfreamework.context.support;


import com.wu.springfreamework.beans.factory.ConfigurableListableBeanFactory;
import com.wu.springfreamework.beans.factory.support.DefaultListableBeanFactory;

/**
 * @author Lynn
 * @create 2022/3/6
 */
public abstract class AbstractRefreshApplicationContext extends AbstractApplicationContext {

    private DefaultListableBeanFactory beanFactory;

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

    @Override
    protected ConfigurableListableBeanFactory getBeanFactory() {
        return beanFactory;
    }
}