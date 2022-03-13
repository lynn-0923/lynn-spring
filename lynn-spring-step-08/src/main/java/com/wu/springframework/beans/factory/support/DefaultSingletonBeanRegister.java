/**
 * Author:   Lynn
 * Date:     2022/3/12 20:41
 */
package com.wu.springframework.beans.factory.support;

import com.wu.springframework.beans.BeansException;
import com.wu.springframework.beans.factory.DisposableBean;
import com.wu.springframework.beans.factory.config.SingletonBeanRegister;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Lynn
 * @create 2022/3/12
 */
public class DefaultSingletonBeanRegister implements SingletonBeanRegister {

    private Map<String, Object> singletonObjects = new HashMap<>();

    private final Map<String, DisposableBean> disposableBeans = new HashMap<>();

    @Override
    public Object getSingleton(String beanName) {
        return singletonObjects.get(beanName);
    }

    protected void addSingleton(String beanName, Object object) {
        singletonObjects.put(beanName, object);
    }

    public void registerDisposableBean(String beanName, DisposableBean disposableBean) {
        disposableBeans.put(beanName, disposableBean);
    }

    public void destroySingletons() {
        Object[] disposableBeanNames = this.disposableBeans.keySet().toArray();
        for (int i = disposableBeanNames.length - 1; i >= 0; i--) {
            Object disposableBeanName = disposableBeanNames[i];
            DisposableBean disposableBean = disposableBeans.remove(disposableBeanName);
            try {
                disposableBean.destroy();
            } catch (Exception e) {
                throw new BeansException("Destroy method on bean with name '" + disposableBeanName + "' threw an exception", e);
            }
        }
    }

}