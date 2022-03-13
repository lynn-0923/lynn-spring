package com.wu.springframework.context.event;

import com.wu.springframework.context.ApplicationEvent;
import com.wu.springframework.context.ApplicationListener;

/**
 * @author: Lynn
 * @date: 2022/3/13
 */
public interface ApplicationEventMulticaster {

    void addApplicationListener(ApplicationListener<?> listener);

    void removeApplicationListener(ApplicationListener<?> listener);

    void multicastEvent(ApplicationEvent event);
}
