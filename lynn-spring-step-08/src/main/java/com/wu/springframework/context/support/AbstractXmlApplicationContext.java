/**
 * Author:   Lynn
 * Date:     2022/3/12 19:37
 */
package com.wu.springframework.context.support;

import com.wu.springframework.beans.factory.support.DefaultListableBeanFactory;
import com.wu.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import com.wu.springframework.core.io.DefaultResourceLoader;

/**
 * @author Lynn
 * @create 2022/3/12
 */
public abstract class AbstractXmlApplicationContext extends AbstractRefreshableApplicationContext {

    @Override
    protected void loadBeanDefinitions(DefaultListableBeanFactory beanFactory) {
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(beanFactory, this);
        String[] configLocations = getConfigLocations();
        if (null != configLocations) {
            xmlBeanDefinitionReader.loadBeanDefinitions(configLocations);
        }
    }

    protected abstract String[] getConfigLocations();
}