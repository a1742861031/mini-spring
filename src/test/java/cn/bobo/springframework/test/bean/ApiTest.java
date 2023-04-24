package cn.bobo.springframework.test.bean;

import cn.bobo.springframework.factory.config.BeanDefinition;
import cn.bobo.springframework.factory.supprt.DefaultListableBeanFactory;
import org.junit.Test;

/**
 * @author by bobo
 * @Description 测试
 * @Date 2023/4/22 21:52
 */
public class ApiTest {
    @Test
    public void test_BeanFactory() {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);
        //第一次获取bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryInfo();
        UserService userServiceSingleTon = (UserService) beanFactory.getBean("userService");
        userServiceSingleTon.queryInfo();
        System.out.println(userService == userServiceSingleTon);
    }
}