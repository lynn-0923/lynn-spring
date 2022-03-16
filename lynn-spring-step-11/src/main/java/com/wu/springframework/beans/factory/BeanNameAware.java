package com.wu.springframework.beans.factory;

/**
 * @author: Lynn
 * @date: 2022/3/13
 */
public interface BeanNameAware extends Aware {

    void setBeanName(String name);

}
