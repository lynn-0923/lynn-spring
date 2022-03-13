/**
 * Author:   Lynn
 * Date:     2022/3/13 20:22
 */
package com.wu.springframework.context.event;

import com.wu.springframework.beans.factory.BeanFactory;
import com.wu.springframework.context.ApplicationEvent;
import com.wu.springframework.context.ApplicationListener;

/**
 * @author Lynn
 * @create 2022/3/13
 */
public class SimpleApplicationEventMulticaster extends AbstractApplicationEventMulticaster {

    public SimpleApplicationEventMulticaster(BeanFactory beanFactory) {
        setBeanFactory(beanFactory);
    }

    @SuppressWarnings("unchecked")
    @Override
    public void multicastEvent(ApplicationEvent event) {
        for (final ApplicationListener applicationListener : getApplicationListeners(event)) {
            applicationListener.onApplicationEvent(event);
        }
    }
}