package com.wu.springframework.core.io;

/**
 * @author: Lynn
 * @date: 2022/2/27
 */
public interface ResourceLoader {

    /**
     * Pseudo URL prefix for loading from the class path: "classpath:"
     */
    String CLASSPATH_URL_PREFIX = "classpath:";

    Resource getResource(String location);
}
