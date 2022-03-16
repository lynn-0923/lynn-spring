/**
 * Author:   Lynn
 * Date:     2022/3/15 23:15
 */
package com.wu.springframework.apo;

/**
 * @author Lynn
 * @create 2022/3/15
 */
public interface PointCut {

    ClassFilter getClassFilter();

    MethodMatcher getMethodMatcher();
}