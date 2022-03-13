/**
 * Author:   Lynn
 * Date:     2022/3/6 18:22
 */
package com.wu.springframework.context.support;


import com.wu.springframework.beans.BeansException;

/**
 * @author Lynn
 * @create 2022/3/6
 */
public class ClassPathXmlApplicationContext extends AbstractXmlApplicationContext {

    private String[] configLocations;

    public ClassPathXmlApplicationContext() {
    }

    @Override
    protected String[] getConfigLocations() {
        return configLocations;
    }

    /**
     * 从 XML 中加载 BeanDefinition，并刷新上下文
     *
     * @param configLocations
     * @throws BeansException
     */
    public ClassPathXmlApplicationContext(String configLocations) throws BeansException {
        this(new String[]{configLocations});
    }

    public ClassPathXmlApplicationContext(String[] configLocations) {
        this.configLocations = configLocations;
        refresh();
    }
}