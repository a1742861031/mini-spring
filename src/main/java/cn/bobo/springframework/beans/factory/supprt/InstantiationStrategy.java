package cn.bobo.springframework.beans.factory.supprt;

import cn.bobo.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * @author by bobo
 * @Description 实例化策略接口
 * @Date 2023/4/24 16:22
 */
public interface InstantiationStrategy {
    /**
     * 实例化
     *
     * @param beanDefinition beanDefinition
     * @param beanName       beanName
     * @param ctor           构造函数
     * @param args           构造函数的参数
     * @return 实例化结果
     */
    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args);
}
