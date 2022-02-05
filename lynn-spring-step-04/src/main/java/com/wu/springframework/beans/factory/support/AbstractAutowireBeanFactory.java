package com.wu.springframework.beans.factory.support;

import cn.hutool.core.bean.BeanUtil;
import com.wu.springframework.beans.BeansException;
import com.wu.springframework.beans.PropertyValue;
import com.wu.springframework.beans.PropertyValues;
import com.wu.springframework.beans.factory.config.BeanDefinition;
import com.wu.springframework.beans.factory.config.BeanReference;

import java.lang.reflect.Constructor;

/**
 * @author wl
 * @date 2022/2/3
 */
public abstract class AbstractAutowireBeanFactory extends AbstractBeanFactory {

    private InstantiationStrategy instantiationStrategy = new CglibSubclassingInstantiationStrategy();

    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition, Object[] args) {
        Object bean = null;

        try {
            bean = createBeanInstance(beanName, beanDefinition, args);
            //填充属性
            applyPropertyValues(bean, beanName, beanDefinition);
        } catch (Exception e) {
            throw new BeansException("Instantiation of bean failed", e);
        }
        addSingleton(beanName, bean);
        return bean;
    }

    protected void applyPropertyValues(Object bean, String beanName, BeanDefinition beanDefinition) {
        try {
            final PropertyValues propertyValues = beanDefinition.getPropertyValues();
            for (PropertyValue propertyValue : propertyValues.getPropertyValues()) {
                final String name = propertyValue.getName();
                Object value = propertyValue.getValue();

                if (value instanceof BeanReference) {
                    final BeanReference beanReference = (BeanReference) value;
                    value = getBean(beanReference.getBeanName());
                }
                //填充属性
                BeanUtil.setFieldValue(bean, name, value);
            }

        } catch (Exception e) {
            throw new BeansException("Error setting property values: " + beanName);
        }
    }

    private Object createBeanInstance(String beanName, BeanDefinition beanDefinition, Object[] args) {
        Constructor<?> constructor = null;
        final Class<?> beanClass = beanDefinition.getBeanClass();
        final Constructor<?>[] constructors = beanClass.getDeclaredConstructors();
        for (Constructor<?> cont : constructors) {
            if (null != args && cont.getParameterTypes().length == args.length) {
                constructor = cont;
                break;
            }
        }
        return getInstantiationStrategy().instantiate(beanDefinition, beanName, constructor, args);
    }

    public InstantiationStrategy getInstantiationStrategy() {
        return instantiationStrategy;
    }

    public void setInstantiationStrategy(InstantiationStrategy instantiationStrategy) {
        this.instantiationStrategy = instantiationStrategy;
    }
}
