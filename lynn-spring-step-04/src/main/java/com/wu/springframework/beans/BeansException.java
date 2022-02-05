package com.wu.springframework.beans;

/**
 * @author wl
 * @date 2022/2/3
 */
public class BeansException extends RuntimeException {

    public BeansException(String msg) {
        super(msg);
    }

    public BeansException(String msg, Throwable cause) {
        super(msg, cause);
    }

}