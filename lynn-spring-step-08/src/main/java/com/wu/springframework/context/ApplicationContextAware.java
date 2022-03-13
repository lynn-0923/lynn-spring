package com.wu.springframework.context;

import com.wu.springframework.beans.factory.Aware;

/**
 * @author: Lynn
 * @date: 2022/3/12
 */
public interface ApplicationContextAware extends Aware {

    void setApplicationContext(ApplicationContext applicationContext);
}
