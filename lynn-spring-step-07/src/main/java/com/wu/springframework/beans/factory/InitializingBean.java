package com.wu.springframework.beans.factory;

/**
 * @author wl
 * @date 2022/3/11
 */
public interface InitializingBean {

    void afterPropertiesSet() throws Exception;
}
