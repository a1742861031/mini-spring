package cn.bobo.springframework.beans.factory.supprt;

import cn.bobo.springframework.BeansException;
import cn.bobo.springframework.beans.factory.config.BeanDefinition;

/**
 * @author by bobo
 * @Description BeanDefinitionRegistry
 * @Date 2023/4/23 11:44
 */
public interface BeanDefinitionRegistry {
    /**
     * 向注册表中注册 BeanDefinition
     *
     * @param beanName beanName
     * @param beanDefinition beanDefinition
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);

    /**
     * 使用Bean名称查询BeanDefinition
     *
     * @param beanName  beanName
     * @return BeanDefinition
     * @throws BeansException BeansException
     */
    BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    /**
     * 判断是否包含指定名称的BeanDefinition
     * @param beanName
     * @return
     */
    boolean containsBeanDefinition(String beanName);

    /**
     * Return the names of all beans defined in this registry.
     *
     * 返回注册表中所有的Bean名称
     */
    String[] getBeanDefinitionNames();
}
