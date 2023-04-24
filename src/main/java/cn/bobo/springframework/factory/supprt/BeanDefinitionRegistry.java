package cn.bobo.springframework.factory.supprt;

import cn.bobo.springframework.factory.config.BeanDefinition;

/**
 * @author by bobo
 * @Description BeanDefinitionRegistry
 * @Date 2023/4/23 11:44
 */
public interface BeanDefinitionRegistry {
    /**
     * 向注册表中注册 BeanDefinition
     *
     * @param beanName       beanName
     * @param beanDefinition beanDefinition
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
