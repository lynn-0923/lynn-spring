package com.wu.springframework.beans.factory.support;

import com.wu.springframework.beans.BeansException;
import com.wu.springframework.core.io.DefaultResourceLoader;
import com.wu.springframework.core.io.Resource;
import com.wu.springframework.core.io.ResourceLoader;

/**
 * @author wl
 * @date 2022/3/1
 */
public abstract class AbstractBeanDefinitionReader implements BeanDefinitionReader {

    private final BeanDefinitionRegister register;

    private ResourceLoader resourceLoader;

    public AbstractBeanDefinitionReader(BeanDefinitionRegister register) {
        this(register, new DefaultResourceLoader());
    }

    public AbstractBeanDefinitionReader(BeanDefinitionRegister beanDefinitionRegister, ResourceLoader resourceLoader) {
        this.register = beanDefinitionRegister;
        this.resourceLoader = resourceLoader;
    }

    @Override
    public BeanDefinitionRegister getRegister() {
        return register;
    }

    @Override
    public ResourceLoader getResourceLoader() {
        return resourceLoader;
    }
}
