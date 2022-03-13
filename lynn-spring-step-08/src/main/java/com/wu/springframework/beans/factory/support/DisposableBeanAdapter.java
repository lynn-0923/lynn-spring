/**
 * Author:   Lynn
 * Date:     2022/3/12 19:34
 */
package com.wu.springframework.beans.factory.support;

import cn.hutool.core.util.StrUtil;
import com.wu.springframework.beans.factory.DisposableBean;
import com.wu.springframework.beans.factory.config.BeanDefinition;

/**
 * @author Lynn
 * @create 2022/3/12
 */
public class DisposableBeanAdapter implements DisposableBean {

    private Object bean;

    private String beanName;

    private String destroyMethodName;

    public DisposableBeanAdapter(Object bean, String beanName, BeanDefinition beanDefinition) {
        this.bean = bean;
        this.beanName = beanName;
        this.destroyMethodName = beanDefinition.getDestroyMethodName();
    }

    @Override
    public void destroy() throws Exception {
        if (bean instanceof DisposableBean) {
            ((DisposableBean) bean).destroy();
        }
        if (StrUtil.isNotBlank(destroyMethodName) && (!(bean instanceof DisposableBean) || !"destroy".equals(destroyMethodName))) {
            bean.getClass().getMethod(destroyMethodName).invoke(bean);
        }
    }
}