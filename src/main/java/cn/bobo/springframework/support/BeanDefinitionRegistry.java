package cn.bobo.springframework.support;

import cn.bobo.springframework.config.BeanDefinition;

/**
 * @author by bobo
 * @Description BeanDefinitionRegistry
 * @Date 2023/4/9 11:31
 */
public interface BeanDefinitionRegistry {
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
