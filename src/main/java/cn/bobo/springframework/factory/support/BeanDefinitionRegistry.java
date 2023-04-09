package cn.bobo.springframework.factory.support;

import cn.bobo.springframework.factory.config.BeanDefinition;

/**
 * @author by bobo
 * @Description BeanDefinitionRegistry
 * @Date 2023/4/9 11:31
 */
public interface BeanDefinitionRegistry {
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
