package cn.bobo.springframework.factory.supprt;

import cn.bobo.springframework.BeansException;
import cn.bobo.springframework.factory.BeanFactory;
import cn.bobo.springframework.factory.config.BeanDefinition;

/**
 * @author by bobo
 * @Description 抽象类定义模版方法
 * @Date 2023/4/22 22:14
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {
    @Override
    public Object getBean(String name) throws BeansException {
        return doGetBean(name, null);
    }

    @Override
    public Object getBean(String name, Object... args) throws BeansException {
        return doGetBean(name, args);
    }

    protected <T> T doGetBean(final String name, final Object[] args) {
        Object bean = getSingleTon(name);
        if (bean != null) {
            return (T) bean;
        }

        BeanDefinition beanDefinition = getBeanDefinition(name);
        return (T) createBean(name, beanDefinition, args);
    }

    /**
     * 获取beanDefinition
     *
     * @param beanName beanName
     * @return 获取beanDefinition
     * @throws BeansException bean异常
     */
    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    /**
     * 创建bean对象
     *
     * @param beanName       beanName
     * @param beanDefinition beanDefinition
     * @param args           参数
     * @return Object对象
     * @throws BeansException bean异常
     */
    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition, Object[] args) throws BeansException;
}
