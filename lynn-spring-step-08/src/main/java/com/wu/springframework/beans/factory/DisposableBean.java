package com.wu.springframework.beans.factory;

/**
 * @author: Lynn
 * @date: 2022/3/12
 */
public interface DisposableBean {

    void destroy() throws NoSuchMethodException, Exception;
}
