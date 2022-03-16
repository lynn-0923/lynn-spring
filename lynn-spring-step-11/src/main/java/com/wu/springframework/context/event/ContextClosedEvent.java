/**
 * Author:   Lynn
 * Date:     2022/3/13 20:22
 */
package com.wu.springframework.context.event;

/**
 * @author Lynn
 * @create 2022/3/13
 */
public class ContextClosedEvent extends ApplicationContextEvent{

    public ContextClosedEvent(Object source) {
        super(source);
    }
}