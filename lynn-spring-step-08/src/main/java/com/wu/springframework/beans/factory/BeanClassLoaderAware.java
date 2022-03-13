/**
 * Author:   Lynn
 * Date:     2022/3/12 19:34
 */
package com.wu.springframework.beans.factory;

/**
 * @author Lynn
 * @create 2022/3/12
 */
public interface BeanClassLoaderAware extends Aware {

    void setBeanClassLoader(ClassLoader classLoader);

}