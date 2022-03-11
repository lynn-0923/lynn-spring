/**
 * Author:   Lynn
 * Date:     2022/3/10 23:58
 */
package com.wu.springfreamework.beans.factory.support;

import cn.hutool.core.bean.BeanUtil;
import com.wu.springfreamework.beans.BeansException;
import com.wu.springfreamework.beans.PropertyValue;
import com.wu.springfreamework.beans.PropertyValues;
import com.wu.springfreamework.beans.factory.config.BeanDefinition;
import com.wu.springfreamework.beans.factory.config.BeanReference;

import java.lang.reflect.Constructor;

/**
 * @author Lynn
 * @create 2022/3/10
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory {

    private InstantiationStrategy instantiationStrategy = new CglibSubClassingInstantiationStrategy();

    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition, Object[] args) {
        Object bean = null;
        try {
            bean = createBeanInstance(beanDefinition, beanName, args);

            applyPropertyValue(beanName, bean, beanDefinition);
        } catch (Throwable e) {
            throw new BeansException("Instantiation of bean failed", e);
        }

        addSingleton(beanName, bean);
        return bean;
    }

    private void applyPropertyValue(String beanName, Object bean, BeanDefinition beanDefinition) {
        try {
            PropertyValues propertyValues = beanDefinition.getPropertyValues();
            for (PropertyValue propertyValue : propertyValues.getPropertyValues()) {
                String name = propertyValue.getName();
                Object value = propertyValue.getValue();
                if (value instanceof BeanReference) {
                    BeanReference beanReference = (BeanReference) bean;
                    value = getBean(beanReference.getBeanName());
                }
                BeanUtil.setFieldValue(bean, name, value);
            }

        } catch (Throwable e) {
            throw new BeansException("Error setting property values：" + beanName);
        }
    }

    private Object createBeanInstance(BeanDefinition beanDefinition, String beanName, Object[] args) {
        Constructor constructorToUse = null;
        Class beanClass = beanDefinition.getBeanClass();
        Constructor[] constructors = beanClass.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            if (null != args && args.length == constructor.getParameterTypes().length) {
                constructorToUse = constructor;
                break;
            }
        }
        getInstantiationStrategy().instantiate(beanDefinition, beanName, constructorToUse, args);
    }

    @Override
    protected BeanDefinition getBeanDefinition(String beanName) {
        return null;
    }

    public InstantiationStrategy getInstantiationStrategy() {
        return instantiationStrategy;
    }
}