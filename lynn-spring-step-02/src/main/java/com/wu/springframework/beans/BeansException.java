package com.wu.springframework.beans;

/**
 * @author wl
 * @date 2022/2/3
 */
public class BeansException extends RuntimeException {

    public BeansException(String message) {
        super(message);
    }

    public BeansException(String message, Throwable cause) {
        super(message, cause);
    }
}
