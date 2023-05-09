package cn.bobo.springframework.test.bean.common;

import cn.bobo.springframework.beans.BeansException;
import cn.bobo.springframework.beans.factory.config.BeanPostProcessor;
import cn.bobo.springframework.test.bean.service.UserService;

/**
 * @author by bobo
 * @Description 自定义
 * @Date 2023/4/30 13:16
 */
public class MyBeanPostProcessor implements BeanPostProcessor{

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("前置处理");
        if ("userService".equals(beanName)) {
            UserService userService = (UserService) bean;
            userService.setLocation("改为：北京");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("后置处理");
        return bean;
    }

//    @Override
//    public void destroy() throws Exception {
//        System.out.println("userservice 销毁");
//    }
//
//    @Override
//    public void afterPropertiesSet() throws Exception {
//        System.out.println("userservice init method");
//    }
}