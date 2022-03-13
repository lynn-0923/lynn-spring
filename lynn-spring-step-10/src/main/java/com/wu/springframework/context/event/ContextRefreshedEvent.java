/**
 * Author:   Lynn
 * Date:     2022/3/13 20:22
 */
package com.wu.springframework.context.event;

/**
 * @author Lynn
 * @create 2022/3/13
 */
public class ContextRefreshedEvent extends ApplicationContextEvent{

    public ContextRefreshedEvent(Object source) {
        super(source);
    }
}