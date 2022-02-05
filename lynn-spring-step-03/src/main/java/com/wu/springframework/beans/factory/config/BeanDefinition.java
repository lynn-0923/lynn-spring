package com.wu.springframework.beans.factory.config;

/**
 * @author wl
 * @date 2022/2/3
 */
@SuppressWarnings("rawtypes")
public class BeanDefinition {

    private Class beanClass;

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }
}
