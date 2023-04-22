package cn.bobo.springframework.test.bean;

import cn.bobo.springframework.config.BeanDefinition;
import cn.bobo.springframework.BeanFactory;
import org.junit.Test;

/**
 * @author by bobo
 * @Description 测试
 * @Date 2023/4/22 21:52
 */
public class ApiTest {
    @Test
    public void test_BeanFactory() {
        // 1.初始化 BeanFactory
        BeanFactory beanFactory = new BeanFactory();

        // 2.注册 bean
        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 3.获取 bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryInfo();
    }
}
