package cn.bobo.springframework.factory.supprt;

import cn.bobo.springframework.BeansException;
import cn.bobo.springframework.factory.config.BeanDefinition;

/**
 * @author by bobo
 * @Description 实例化bean类
 * @Date 2023/4/23 11:40
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory {
    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException {
        Object bean = null;
        try {
            bean = beanDefinition.getBeanClass().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new BeansException("Instantiation of bean failed", e);
        }
        //添加到单例map中
        addSingleton(beanName, bean);
        return bean;
    }
}
