package com.wu.springframework.apo;

import java.lang.reflect.Method;

/**
 * @author: Lynn
 * @date: 2022/3/15
 */
public interface MethodMatcher {

    boolean matches(Method method, Class<?> clazz);
}
