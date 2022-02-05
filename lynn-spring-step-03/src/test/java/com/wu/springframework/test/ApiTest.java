package com.wu.springframework.test;

import com.wu.springframework.beans.factory.config.BeanDefinition;
import com.wu.springframework.beans.factory.support.DefaultListableBeanFactory;
import com.wu.springframework.test.beans.UserService;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.NoOp;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author wl
 * @date 2022/2/4
 */
public class ApiTest {

    @Test
    public void test_BeanFactory() {
        final DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        final BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        final UserService userService = (UserService) beanFactory.getBean("userService", "小高");

        userService.queryUserInfo();
    }

    @Test
    public void test_Cglib() {
        final Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(UserService.class);

        enhancer.setCallback(new NoOp() {
            @Override
            public int hashCode() {
                return super.hashCode();
            }
        });
        final Object object = enhancer.create(new Class[]{String.class}, new Object[]{"小高"});
        System.out.println(object);
    }

    @Test
    public void test_NewInstance() throws IllegalAccessException, InstantiationException {
        final UserService userService = UserService.class.newInstance();
        System.out.println(userService);
    }

    @Test
    public void test_Constructor() throws IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException {
        final Class<UserService> userServiceClass = UserService.class;
        final Constructor<UserService> declaredConstructor = userServiceClass.getDeclaredConstructor(String.class);
        final UserService userService = declaredConstructor.newInstance("小高");
        System.out.println(userService);
    }

    @Test
    public void test_Parameters() throws IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException {
        final Class<UserService> beanClass = UserService.class;
        final Constructor<?>[] declaredConstructors = beanClass.getDeclaredConstructors();
        Constructor constructor = null;
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            if (declaredConstructor.getParameterTypes().length == 1) {
                constructor = declaredConstructor;
                break;
            }
        }
        final Constructor<UserService> declaredConstructor = beanClass.getDeclaredConstructor(constructor.getParameterTypes());
        final UserService userService = declaredConstructor.newInstance("小高");
        System.out.println(userService);
    }
}
