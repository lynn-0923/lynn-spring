/**
 * Author:   Lynn
 * Date:     2022/3/13 20:20
 */
package com.wu.springframework.context.event;

import com.wu.springframework.context.ApplicationContext;
import com.wu.springframework.context.ApplicationEvent;

/**
 * @author Lynn
 * @create 2022/3/13
 */
public class ApplicationContextEvent extends ApplicationEvent {

    public ApplicationContextEvent(Object source) {
        super(source);
    }

    public final ApplicationContext getApplicationContext() {
        return ((ApplicationContext) getSource());
    }
}