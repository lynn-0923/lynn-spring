/**
 * Author:   Lynn
 * Date:     2022/3/13 20:38
 */
package com.wu.springframework.test;

import com.wu.springframework.context.support.ClassPathXmlApplicationContext;
import com.wu.springframework.test.event.CustomEvent;
import org.junit.Test;

/**
 * @author Lynn
 * @create 2022/3/13
 */
public class ApiTest {

    @Test
    public void test_event() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
        applicationContext.publishEvent(new CustomEvent(applicationContext, 1019129009086763L, "成功了！"));

        applicationContext.registerShutdownHook();
    }

}