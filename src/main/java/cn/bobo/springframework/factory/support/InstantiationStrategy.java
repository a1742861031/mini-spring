package cn.bobo.springframework.factory.support;

import cn.bobo.springframework.BeansException;
import cn.bobo.springframework.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * @author by bobo
 * @Description 定义实例化策略接口
 * @Date 2023/4/9 11:47
 */
public interface InstantiationStrategy {
    /**
     * 策略化接口
     *
     * @param beanDefinition beanDefinition
     * @param beanName       beanName
     * @param constructor    拿到符合入参信息相对应的构造函数
     * @param args           参数
     * @return object
     * @throws BeansException 异常
     */
    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor constructor, Object[] args) throws BeansException;
}
