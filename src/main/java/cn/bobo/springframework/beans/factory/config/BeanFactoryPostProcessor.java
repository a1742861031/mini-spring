package cn.bobo.springframework.beans.factory.config;

import cn.bobo.springframework.beans.BeansException;
import cn.bobo.springframework.beans.factory.ConfigurableListableBeanFactory;

/**
 * @author by bobo
 * @Description BeanFactory 扩展
 * @Date 2023/4/29 18:24
 */
public interface BeanFactoryPostProcessor {
    /**
     * 在所有的BeanDefinition 加载完成之后，实例化Bean之前，提供修改BeanDefinition属性的机制
     *
     * @param beanFactory beanFactory
     * @throws BeansException BeanException
     */
    void postProcessorBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException;
}
