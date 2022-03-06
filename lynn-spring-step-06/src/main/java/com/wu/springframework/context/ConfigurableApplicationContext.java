/**
 * Author:   Lynn
 * Date:     2022/3/6 18:07
 */
package com.wu.springframework.context;

import com.wu.springframework.beans.BeansException;

/**
 * @author Lynn
 * @create 2022/3/6
 */
public interface ConfigurableApplicationContext extends ApplicationContext{

    /**
     * 刷新容器
     *
     * @throws BeansException
     */
    void refresh() throws BeansException;

}