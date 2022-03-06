/**
 * Author:   Lynn
 * Date:     2022/3/6 16:24
 */
package com.wu.springframework.core.io;

/**
 * @author Lynn
 * @create 2022/3/6
 */
public interface ResourceLoader {

    /**
     * Pseudo URL prefix for loading from the class path: "classpath:"
     */
    String CLASSPATH_URL_PREFIX = "classpath:";

    Resource getResource(String location);
}