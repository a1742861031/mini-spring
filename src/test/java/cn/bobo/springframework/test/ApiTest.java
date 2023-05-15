package cn.bobo.springframework.test;

import cn.bobo.springframework.context.ClassPathXmlApplicationContext;
import cn.bobo.springframework.test.event.CustomEvent;
import org.junit.Test;

/**
 * @author by bobo
 * @Description 测试
 * @Date 2023/5/15 10:27
 */

public class ApiTest {
    @Test
    public void test_event() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
        applicationContext.publishEvent(new CustomEvent(applicationContext, 1234L, "成功了"));
        applicationContext.registerShutdownHook();
    }
}
