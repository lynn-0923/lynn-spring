package com.wu.springframework.context;

/**
 * @author: Lynn
 * @date: 2022/3/13
 */
public interface ApplicationEventPublisher {

    void publishEvent(ApplicationEvent event);
}
