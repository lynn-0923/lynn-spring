/**
 * Author:   Lynn
 * Date:     2022/3/10 23:44
 */
package com.wu.springfreamework.beans.factory.support;

import com.wu.springfreamework.core.io.DefaultClassLoader;
import com.wu.springfreamework.core.io.ResourceLoader;

/**
 * @author Lynn
 * @create 2022/3/10
 */
public abstract class AbstractBeanDefinitionReader implements BeanDefinitionReader {

    private final BeanDefinitionRegister register;

    private ResourceLoader resourceLoader;

    public AbstractBeanDefinitionReader(BeanDefinitionRegister register) {
        this(register, new DefaultClassLoader());
    }

    public AbstractBeanDefinitionReader(BeanDefinitionRegister register, ResourceLoader resourceLoader) {
        this.register = register;
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