/**
 * Author:   Lynn
 * Date:     2022/3/13 13:32
 */
package com.wu.springframework.beans.factory.support;

import com.wu.springframework.core.io.DefaultResourceLoader;
import com.wu.springframework.core.io.ResourceLoader;

/**
 * @author Lynn
 * @create 2022/3/13
 */
public abstract class AbstractBeanDefinitionReader implements BeanDefinitionReader {

    private BeanDefinitionRegistry registry;

    private ResourceLoader resourceLoader;

    public AbstractBeanDefinitionReader(BeanDefinitionRegistry registry, ResourceLoader resourceLoader) {
        this.registry = registry;
        this.resourceLoader = resourceLoader;
    }

    public AbstractBeanDefinitionReader(BeanDefinitionRegistry registry) {
        this(registry, new DefaultResourceLoader());
    }

    @Override
    public BeanDefinitionRegistry getRegistry() {
        return registry;
    }

    @Override
    public ResourceLoader getResourceLoader() {
        return resourceLoader;
    }
}