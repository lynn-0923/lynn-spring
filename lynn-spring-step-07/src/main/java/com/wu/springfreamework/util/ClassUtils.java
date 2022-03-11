/**
 * Author:   Lynn
 * Date:     2022/3/10 19:11
 */
package com.wu.springfreamework.util;

/**
 * @author Lynn
 * @create 2022/3/10
 */
public class ClassUtils {

    public static ClassLoader getDefaultClassLoader() {
        ClassLoader cl = null;

        try {
            cl = Thread.currentThread().getContextClassLoader();
        } catch (Throwable e) {
        }
        if (cl == null) {
            cl = ClassUtils.class.getClassLoader();
        }
        return cl;
    }
}