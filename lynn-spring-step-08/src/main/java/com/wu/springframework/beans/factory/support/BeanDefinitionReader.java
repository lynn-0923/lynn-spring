package com.wu.springframework.beans.factory.support;

import com.wu.springframework.core.io.Resource;
import com.wu.springframework.core.io.ResourceLoader;

/**
 * @author: Lynn
 * @date: 2022/3/12
 */
public interface BeanDefinitionReader {

    BeanDefinitionRegistry getRegistry();

    ResourceLoader getResourceLoader();

    void loadBeanDefinitions(String location);

    void loadBeanDefinitions(String... location);

    void loadBeanDefinitions(Resource resource);

    void loadBeanDefinitions(Resource... resource);
}
