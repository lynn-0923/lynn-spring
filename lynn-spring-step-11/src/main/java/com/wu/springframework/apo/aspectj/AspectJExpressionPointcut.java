/**
 * Author:   Lynn
 * Date:     2022/3/15 23:18
 */
package com.wu.springframework.apo.aspectj;

import com.wu.springframework.apo.ClassFilter;
import com.wu.springframework.apo.MethodMatcher;
import com.wu.springframework.apo.PointCut;
import org.aspectj.weaver.tools.PointcutExpression;
import org.aspectj.weaver.tools.PointcutParser;
import org.aspectj.weaver.tools.PointcutPrimitive;

import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Lynn
 * @create 2022/3/15
 */
public class AspectJExpressionPointcut implements PointCut, ClassFilter, MethodMatcher {

    private static final Set<PointcutPrimitive> SUPPORT_PRIMITIVE = new HashSet<>();

    static {
        SUPPORT_PRIMITIVE.add(PointcutPrimitive.EXECUTION);
    }

    private final PointcutExpression pointcutExpression;

    public AspectJExpressionPointcut(String expression) {
        PointcutParser pointcutParser = PointcutParser
                .getPointcutParserSupportingSpecifiedPrimitivesAndUsingSpecifiedClassLoaderForResolution(SUPPORT_PRIMITIVE, this.getClass().getClassLoader());

        pointcutExpression = pointcutParser.parsePointcutExpression(expression);
    }

    @Override
    public boolean matches(Class<?> clazz) {
        return pointcutExpression.couldMatchJoinPointsInType(clazz);
    }

    @Override
    public boolean matches(Method method, Class<?> clazz) {
        return pointcutExpression.matchesMethodExecution(method).alwaysMatches();
    }

    @Override
    public ClassFilter getClassFilter() {
        return this;
    }

    @Override
    public MethodMatcher getMethodMatcher() {
        return this;
    }
}