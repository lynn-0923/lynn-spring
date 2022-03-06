/**
 * Author:   Lynn
 * Date:     2022/3/6 16:22
 */
package com.wu.springframework.util;

/**
 * @author Lynn
 * @create 2022/3/6
 */
public class ClassUtils {

    public static ClassLoader getDefaultClassLoader() {
        ClassLoader cl = null;

        try {
            cl = Thread.currentThread().getContextClassLoader();
        } catch (Throwable e) {

        }
        if (null == cl) cl = ClassUtils.class.getClassLoader();
        return cl;
    }

}