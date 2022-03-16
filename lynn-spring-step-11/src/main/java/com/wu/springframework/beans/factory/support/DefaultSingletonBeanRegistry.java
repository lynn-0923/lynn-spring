/**
 * Author:   Lynn
 * Date:     2022/3/13 13:33
 */
package com.wu.springframework.beans.factory.support;

import com.wu.springframework.beans.BeansException;
import com.wu.springframework.beans.factory.DisposableBean;
import com.wu.springframework.beans.factory.config.SingletonBeanRegister;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Lynn
 * @create 2022/3/13
 */
public class DefaultSingletonBeanRegistry implements SingletonBeanRegister {

    /**
     * Internal marker for a null singleton object:
     * used as marker value for concurrent Maps (which don't support null values).
     */
    protected static final Object NULL_OBJECT = new Object();

    private Map<String, Object> singletonObject = new HashMap<>();

    private Map<String, DisposableBean> disposableBeanMap = new HashMap<>();

    @Override

    public Object getSingleton(String beanName) {
        return singletonObject.get(beanName);
    }

    @Override
    public void registerSingleton(String beanName, Object object) {
        singletonObject.put(beanName, object);
    }

    public void registerDisposableBean(String beanName, DisposableBean bean) {
        disposableBeanMap.put(beanName, bean);
    }

    public void destroySingletons() {
        Set<String> keySet = this.disposableBeanMap.keySet();
        Object[] disposableBeanNames = keySet.toArray();

        for (int i = disposableBeanNames.length - 1; i >= 0; i--) {
            Object beanName = disposableBeanNames[i];
            DisposableBean disposableBean = disposableBeanMap.remove(beanName);
            try {
                disposableBean.destroy();
            } catch (Exception e) {
                throw new BeansException("Destroy method on bean with name '" + beanName + "' threw an exception", e);
            }
        }
    }
}