/**
 * Author:   Lynn
 * Date:     2022/2/28 0:02
 */
package com.wu.springfreamework.beans;

/**
 * @author Lynn
 * @create 2022/2/28
 */
public class BeansException extends RuntimeException {
    public BeansException(String msg) {
        super(msg);
    }

    public BeansException(String msg, Throwable cause) {
        super(msg, cause);
    }

}