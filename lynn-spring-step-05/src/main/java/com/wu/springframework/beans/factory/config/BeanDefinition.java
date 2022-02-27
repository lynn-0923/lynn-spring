/**
 * Author:   Lynn
 * Date:     2022/2/28 0:23
 */
package com.wu.springframework.beans.factory.config;

import com.wu.springframework.beans.PropertyValue;
import com.wu.springframework.beans.PropertyValues;

/**
 * @author Lynn
 * @create 2022/2/28
 */
@SuppressWarnings("rawtypes")
public class BeanDefinition {

    private Class beanClass;

    private PropertyValues propertyValues;

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
        this.propertyValues = new PropertyValues();
    }

    public BeanDefinition(Class beanClass, PropertyValues propertyValues) {
        this.beanClass = beanClass;
        this.propertyValues = propertyValues != null ? propertyValues : new PropertyValues();
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }

    public PropertyValues getPropertyValues() {
        return propertyValues;
    }

    public void setPropertyValues(PropertyValues propertyValues) {
        this.propertyValues = propertyValues;
    }
}