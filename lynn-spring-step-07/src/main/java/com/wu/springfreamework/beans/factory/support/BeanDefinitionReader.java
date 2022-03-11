/**
 * Author:   Lynn
 * Date:     2022/3/10 23:44
 */
package com.wu.springfreamework.beans.factory.support;

import com.wu.springfreamework.core.io.Resource;
import com.wu.springfreamework.core.io.ResourceLoader;

/**
 * @author Lynn
 * @create 2022/3/10
 */
public interface BeanDefinitionReader {

    BeanDefinitionRegister getRegister();

    ResourceLoader getResourceLoader();

    void loadBeanDefinitions(Resource resource);

    void loadBeanDefinitions(Resource... resources);

    void loadBeanDefinitions(String location);

    void loadBeanDefinitions(String... locations);

}