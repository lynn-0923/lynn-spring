/**
 * Author:   Lynn
 * Date:     2022/2/28 0:24
 */
package com.wu.springframework.beans.factory.config;

/**
 * @author Lynn
 * @create 2022/2/28
 */
public class BeanReference {

    private final String beanName;

    public BeanReference(String beanName) {
        this.beanName = beanName;
    }

    public String getBeanName() {
        return beanName;
    }

}