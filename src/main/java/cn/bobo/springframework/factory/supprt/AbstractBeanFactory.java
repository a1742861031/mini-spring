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
        //如果获取到bean对象，直接返回
        Object bean = getSingleTon(name);
        if (bean != null) {
            return bean;
        }
        BeanDefinition beanDefinition = getBeanDefinition(name);
        return createBean(name, beanDefinition);
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
     * @param beanName
     * @param beanDefinition
     * @return
     * @throws BeansException
     */
    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException;
}
