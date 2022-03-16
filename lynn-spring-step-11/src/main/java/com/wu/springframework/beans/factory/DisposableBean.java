/**
 * Author:   Lynn
 * Date:     2022/3/13 13:29
 */
package com.wu.springframework.beans.factory;

/**
 * @author Lynn
 * @create 2022/3/13
 */
public interface DisposableBean {

    void destroy() throws Exception;

}