package com.wu.springframework;

/**
 * @author wl
 * @date 2022/2/3
 */
public class BeanDefinition {

    private Object bean;

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return bean;
    }
}
