/**
 * Author:   Lynn
 * Date:     2022/3/10 23:44
 */
package com.wu.springframework.beans.factory.support;

import com.wu.springframework.beans.BeansException;
import com.wu.springframework.core.io.Resource;
import com.wu.springframework.core.io.ResourceLoader;

/**
 * @author Lynn
 * @create 2022/3/10
 */
public interface BeanDefinitionReader {


    BeanDefinitionRegistry getRegistry();

    ResourceLoader getResourceLoader();

    void loadBeanDefinitions(Resource resource) throws BeansException;

    void loadBeanDefinitions(Resource... resources) throws BeansException;

    void loadBeanDefinitions(String location) throws BeansException;

    void loadBeanDefinitions(String... locations) throws BeansException;

}