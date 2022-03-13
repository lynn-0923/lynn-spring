package com.wu.springframework.beans.factory;

/**
 * @author: Lynn
 * @date: 2022/3/13
 */
public interface BeanClassLoaderAware extends Aware{

    void setBeanClassLoader(ClassLoader classLoader);
}
