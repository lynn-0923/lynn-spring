package com.wu.springframework.core.io;

/**
 * @author: Lynn
 * @date: 2022/3/10
 */
public interface ResourceLoader {

    /**
     * Pseudo URL prefix for loading from the class path: "classpath:"
     */
    String CLASSPATH_URL_PREFIX = "classpath:";

    Resource getResource(String location);
}
