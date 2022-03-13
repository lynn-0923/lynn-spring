package com.wu.springframework.context;

/**
 * @author: Lynn
 * @date: 2022/3/13
 */
public interface ConfigurableApplicationContext extends ApplicationContext{

    void refresh();

    void registerShutdownHook();

    void close();
}
