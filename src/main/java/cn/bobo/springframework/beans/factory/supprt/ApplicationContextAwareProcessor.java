package cn.bobo.springframework.beans.factory.supprt;

import cn.bobo.springframework.beans.BeansException;
import cn.bobo.springframework.beans.factory.config.BeanPostProcessor;
import cn.bobo.springframework.context.ApplicationContext;
import cn.bobo.springframework.context.ApplicationContextAware;

/**
 * @author by bobo
 * @Description 包装处理器
 * @Date 2023/5/9 15:34
 */
public class ApplicationContextAwareProcessor implements BeanPostProcessor {
    private final ApplicationContext applicationContext;

    public ApplicationContextAwareProcessor(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof ApplicationContextAware) {
            ((ApplicationContextAware) bean).setApplicationContext(applicationContext);
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }
}
