package cn.bobo.springframework.test.bean;

import cn.bobo.springframework.factory.config.BeanDefinition;
import cn.bobo.springframework.factory.support.DefaultListableBeanFactory;
import org.junit.Test;

/**
 * @author by bobo
 * @Description 测试
 * @Date 2023/4/9 11:37
 */
public class ApiTest {
    @Test
    public void test_BeanFactory() {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);
        UserService userService = (UserService) beanFactory.getBean("userService", "bobo");
        userService.queryUserInfo();
    }

}
