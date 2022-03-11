/**
 * Author:   Lynn
 * Date:     2022/3/10 23:44
 */
package com.wu.springfreamework.beans.factory.support;

import com.wu.springfreamework.beans.BeansException;
import com.wu.springfreamework.core.io.Resource;
import com.wu.springfreamework.core.io.ResourceLoader;

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