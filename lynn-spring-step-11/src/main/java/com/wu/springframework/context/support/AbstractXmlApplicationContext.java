/**
 * Author:   Lynn
 * Date:     2022/3/13 13:35
 */
package com.wu.springframework.context.support;

import com.wu.springframework.beans.factory.support.DefaultListableBeanFactory;
import com.wu.springframework.beans.factory.xml.XmlBeanDefinitionReader;

/**
 * @author Lynn
 * @create 2022/3/13
 */
public abstract class AbstractXmlApplicationContext extends AbstractRefreshableApplicationContext {

    @Override
    protected void loadBeanDefinitions(DefaultListableBeanFactory beanFactory) {
        XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanFactory, this);
        String[] configLocations = getConfigLocations();
        if (null != configLocations){
            beanDefinitionReader.loadBeanDefinitions(configLocations);
        }
    }

    protected abstract String[] getConfigLocations();

}