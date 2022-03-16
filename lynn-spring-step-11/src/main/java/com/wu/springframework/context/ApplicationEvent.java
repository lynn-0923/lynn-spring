/**
 * Author:   Lynn
 * Date:     2022/3/13 19:57
 */
package com.wu.springframework.context;

import java.util.EventObject;

/**
 * @author Lynn
 * @create 2022/3/13
 */
public abstract class ApplicationEvent extends EventObject {

    public ApplicationEvent(Object source) {
        super(source);
    }
}