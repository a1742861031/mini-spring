package cn.bobo.springframework.test.bean;

import cn.bobo.springframework.context.ClassPathXmlApplicationContext;
import cn.bobo.springframework.core.io.DefaultResourceLoader;
import cn.bobo.springframework.test.bean.service.UserService;
import org.junit.Test;

/**
 * @author by bobo
 * @Description 测试
 * @Date 2023/4/22 21:52
 */
public class ApiTest {
    private DefaultResourceLoader resourceLoader;

    @Test
    public void test_xml() {
        // 1.初始化 BeanFactory
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
        applicationContext.registerShutdownHook();
        UserService userService1 = applicationContext.getBean("userService", UserService.class);
        UserService userService2 = applicationContext.getBean("userService", UserService.class);
        System.out.println(userService1);
        System.out.println(userService2);
        System.out.println(userService1 == userService2);

    }

    @Test
    public void test_factory_bean() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
        applicationContext.registerShutdownHook();
        UserService userService = applicationContext.getBean("userService", UserService.class);
        System.out.println("测试结果：" + userService.queryUserInfo());
    }
}