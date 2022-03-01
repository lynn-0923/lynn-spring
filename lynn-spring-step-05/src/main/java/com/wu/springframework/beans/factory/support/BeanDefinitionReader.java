package com.wu.springframework.beans.factory.support;

import com.wu.springframework.beans.BeansException;
import com.wu.springframework.core.io.Resource;
import com.wu.springframework.core.io.ResourceLoader;

/**
 * @author wl
 * @date 2022/3/1
 */
public interface BeanDefinitionReader {

    BeanDefinitionRegister getRegister();

    ResourceLoader getResourceLoader();

    void loadBeanDefinitions(Resource resource) throws BeansException;

    void loadBeanDefinitions(Resource... resource) throws BeansException;

    void loadBeanDefinitions(String location) throws BeansException;
}
