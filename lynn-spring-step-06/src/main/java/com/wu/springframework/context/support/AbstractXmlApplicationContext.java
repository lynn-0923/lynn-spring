/**
 * Author:   Lynn
 * Date:     2022/3/6 18:19
 */
package com.wu.springframework.context.support;

import com.wu.springframework.beans.factory.support.DefaultListableBeanFactory;
import com.wu.springframework.beans.factory.xml.XmlBeanDefinitionReader;

/**
 * @author Lynn
 * @create 2022/3/6
 */
public abstract class AbstractXmlApplicationContext extends AbstractRefreshApplicationContext {

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