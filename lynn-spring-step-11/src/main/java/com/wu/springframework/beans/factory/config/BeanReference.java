/**
 * Author:   Lynn
 * Date:     2022/3/13 13:27
 */
package com.wu.springframework.beans.factory.config;

/**
 * @author Lynn
 * @create 2022/3/13
 */
public class BeanReference {

    private String beanName;

    public BeanReference(String beanName) {
        this.beanName = beanName;
    }

    public String getBeanName() {
        return beanName;
    }

    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }
}