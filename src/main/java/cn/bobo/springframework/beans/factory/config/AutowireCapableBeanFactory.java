package cn.bobo.springframework.beans.factory.config;

import cn.bobo.springframework.beans.BeansException;
import cn.bobo.springframework.beans.factory.BeanFactory;

/**
 * @author by bobo
 * @Description AutowireCapableBeanFactory
 * @Date 2023/4/25 16:33
 */
public interface AutowireCapableBeanFactory extends BeanFactory {
    /**
     * 执行 BeanPostProcessors 接口实现类的 postProcessBeforeInitialization 方法
     *
     * @param existingBean bean
     * @param beanName     beanName
     * @return
     * @throws BeansException
     */
    Object applyBeanPostProcessorsBeforeInitialization(Object existingBean, String beanName) throws BeansException;

    /**
     * 执行 BeanPostProcessors 接口实现类的 postProcessorsAfterInitialization 方法
     *
     * @param existingBean existingBean
     * @param beanName     beanName
     * @return
     * @throws BeansException
     */
    Object applyBeanPostProcessorsAfterInitialization(Object existingBean, String beanName) throws BeansException;
}
