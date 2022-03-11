/**
 * Author:   Lynn
 * Date:     2022/3/10 23:42
 */
package com.wu.springfreamework.beans.factory.support;

import com.wu.springfreamework.beans.factory.config.BeanDefinition;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.NoOp;

import java.lang.reflect.Constructor;

/**
 * @author Lynn
 * @create 2022/3/10
 */
public class CglibSubClassingInstantiationStrategy implements InstantiationStrategy {

    @Override
    public Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor constructor, Object[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(beanDefinition.getBeanClass());
        enhancer.setCallback(new NoOp() {
            @Override
            public int hashCode() {
                return super.hashCode();
            }
        });
        if (null != constructor) {
            return enhancer.create(constructor.getParameterTypes(), args);
        }
        return enhancer.create();
    }
}