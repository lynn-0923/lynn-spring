package com.wu.springframework.apo;

/**
 * @author: Lynn
 * @date: 2022/3/15
 */
public interface ClassFilter {

    boolean matches(Class<?> clazz);
}
