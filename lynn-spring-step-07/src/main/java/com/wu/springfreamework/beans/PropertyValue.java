/**
 * Author:   Lynn
 * Date:     2022/2/28 0:04
 */
package com.wu.springfreamework.beans;

/**
 * @author Lynn
 * @create 2022/2/28
 */
public class PropertyValue {

    private final String name;

    private final Object value;

    public PropertyValue(String name, Object value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Object getValue() {
        return value;
    }
}