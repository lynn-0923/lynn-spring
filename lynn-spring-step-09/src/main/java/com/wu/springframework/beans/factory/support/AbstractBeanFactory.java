/**
 * Author:   Lynn
 * Date:     2022/3/13 13:31
 */
package com.wu.springframework.beans.factory.support;

import com.wu.springframework.beans.factory.FactoryBean;
import com.wu.springframework.beans.factory.config.BeanDefinition;
import com.wu.springframework.beans.factory.config.BeanPostProcessor;
import com.wu.springframework.beans.factory.config.ConfigurableBeanFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Lynn
 * @create 2022/3/13
 */
public abstract class AbstractBeanFactory extends FactoryBeanRegistrySupport implements ConfigurableBeanFactory {

    private List<BeanPostProcessor> beanPostProcessors = new ArrayList<>();

    @Override
    public void addBeanPostProcessor(BeanPostProcessor beanPostProcessor) {
        beanPostProcessors.remove(beanPostProcessor);
        beanPostProcessors.add(beanPostProcessor);
    }

    @Override
    public Object getBean(String beanName) {
        return doGetBean(beanName, null);
    }

    @Override
    public Object getBean(String beanName, Object... args) {
        return doGetBean(beanName, args);
    }

    @Override
    public <T> T getBean(String beanName, Class<T> requiredType) {
        return (T) getBean(beanName);
    }

    private <T> T doGetBean(String beanName, Object[] args) {
        Object sharedInstance = getSingleton(beanName);
        if (null != sharedInstance) {
            // 如果是 FactoryBean，则需要调用 FactoryBean#getObject
            return (T) getObjectForBeanInstance(sharedInstance, beanName);
        }

        BeanDefinition beanDefinition = getBeanDefinition(beanName);

        Object bean = createBean(beanName, beanDefinition, args);
        return (T) getObjectForBeanInstance(bean, beanName);
    }

    private Object getObjectForBeanInstance(Object sharedInstance, String beanName) {
        if (!(sharedInstance instanceof FactoryBean)) {
            return sharedInstance;
        }
        Object object = getCachedObjectForFactoryBean(beanName);
        if (object == null) {
            FactoryBean factoryBean = (FactoryBean) sharedInstance;
            object = getObjectFromFactoryBean(factoryBean, beanName);
        }
        return object;
    }

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition, Object[] args);

    protected abstract BeanDefinition getBeanDefinition(String beanName);

    public List<BeanPostProcessor> getBeanPostProcessors() {
        return beanPostProcessors;
    }
}