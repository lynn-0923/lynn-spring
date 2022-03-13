package com.wu.springframework.context;

import java.util.EventListener;

/**
 * @author: Lynn
 * @date: 2022/3/13
 */
public interface ApplicationListener<E extends ApplicationEvent> extends EventListener {

    void onApplicationEvent(E event);
}
