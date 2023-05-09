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

        // 2. 获取Bean对象调用方法
        UserService userService = applicationContext.getBean("userService", UserService.class);
        String result = userService.queryUserInfo();
        System.out.println("测试结果：" + result);
        System.out.println("ApplicationContextAware：" + userService.getApplicationContext());
        System.out.println("BeanFactoryAware：" + userService.getBeanFactory());
    }

}