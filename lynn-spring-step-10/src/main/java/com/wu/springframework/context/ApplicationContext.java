package com.wu.springframework.context;

import com.wu.springframework.beans.factory.HierarchicalBeanFactory;
import com.wu.springframework.beans.factory.ListableBeanFactory;
import com.wu.springframework.core.io.ResourceLoader;

/**
 * @author: Lynn
 * @date: 2022/3/13
 */
public interface ApplicationContext extends ListableBeanFactory, HierarchicalBeanFactory, ResourceLoader, ApplicationEventPublisher {
}
