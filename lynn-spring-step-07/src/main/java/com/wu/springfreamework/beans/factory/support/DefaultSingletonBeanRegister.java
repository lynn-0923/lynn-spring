/**
 * Author:   Lynn
 * Date:     2022/3/10 23:36
 */
package com.wu.springfreamework.beans.factory.support;

import com.wu.springfreamework.beans.factory.config.BeanDefinition;
import com.wu.springfreamework.beans.factory.config.SingletonBeanRegistry;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Lynn
 * @create 2022/3/10
 */
public class DefaultSingletonBeanRegister implements SingletonBeanRegistry {

    private Map<String, Object> singletonObject = new HashMap<>();

    @Override
    public Object getSingleton(String beanName) {
        return singletonObject.get(beanName);
    }

    protected void addSingleton(String beanName, Object object) {
        singletonObject.put(beanName, object);
    }
}