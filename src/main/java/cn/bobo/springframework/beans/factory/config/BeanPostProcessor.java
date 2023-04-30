package cn.bobo.springframework.beans.factory.config;

import cn.bobo.springframework.beans.BeansException;

/**
 * @author by bobo
 * @Description 对已经加载的bean进行扩展
 * @Date 2023/4/29 18:28
 */
public interface BeanPostProcessor {
    /**
     * 在bean对象执行初始化方式之前，执行此方法
     *
     * @param bean     bean
     * @param beanName beanName
     * @return bean对象
     * @throws BeansException 异常
     */
    Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException;

    /**
     * 在bean对象执行初始化方法之后，执行此方法
     *
     * @param bean     bean
     * @param beanName beanName
     * @return bean对象
     * @throws BeansException 异常
     */
    Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException;
}
