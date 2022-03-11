/**
 * Author:   Lynn
 * Date:     2022/3/10 23:44
 */
package com.wu.springfreamework.beans.factory.support;

import com.wu.springfreamework.core.io.DefaultResourceLoader;
import com.wu.springfreamework.core.io.ResourceLoader;

/**
 * @author Lynn
 * @create 2022/3/10
 */
public abstract class AbstractBeanDefinitionReader implements BeanDefinitionReader {

    private final BeanDefinitionRegistry registry;

    private ResourceLoader resourceLoader;

    protected AbstractBeanDefinitionReader(BeanDefinitionRegistry registry) {
        this(registry, new DefaultResourceLoader());
    }

    public AbstractBeanDefinitionReader(BeanDefinitionRegistry registry, ResourceLoader resourceLoader) {
        this.registry = registry;
        this.resourceLoader = resourceLoader;
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