/**
 * Author:   Lynn
 * Date:     2022/3/15 23:16
 */
package com.wu.springframework.apo;

/**
 * @author Lynn
 * @create 2022/3/15
 */
public class TargetSource {

    private final Object target;

    public TargetSource(Object target) {
        this.target = target;
    }

    public Object getTarget() {
        return target;
    }

    public Class<?>[] getTargetClass() {
        return target.getClass().getInterfaces();
    }
}