package cn.bobo.springframework.beans.factory.supprt;

import cn.bobo.springframework.beans.BeansException;
import cn.bobo.springframework.beans.factory.ConfigurableListableBeanFactory;
import cn.bobo.springframework.beans.factory.config.BeanDefinition;
import cn.bobo.springframework.beans.factory.config.BeanPostProcessor;
import cn.bobo.springframework.utils.ClassUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author by bobo
 * @Description 抽象类定义模版方法
 * @Date 2023/4/22 22:14
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements ConfigurableListableBeanFactory {
    private final List<BeanPostProcessor> beanPostProcessors = new ArrayList<>();
    private ClassLoader beanClassLoader = ClassUtils.getDefaultClassLoader();

    @Override
    public Object getBean(String name) throws BeansException {
        return doGetBean(name, null);
    }

    @Override
    public Object getBean(String name, Object... args) throws BeansException {
        return doGetBean(name, args);
    }

    @Override
    public <T> T getBean(String name, Class<T> requireType) throws BeansException {
        return (T) getBean(name);
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
    @Override
    public abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;

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

    @Override
    public void addBeanPostProcessor(BeanPostProcessor beanPostProcessor) {
        this.beanPostProcessors.remove(beanPostProcessor);
        this.beanPostProcessors.add(beanPostProcessor);
    }

    public List<BeanPostProcessor> getBeanPostProcessors() {
        return beanPostProcessors;
    }

    public ClassLoader getBeanClassLoader() {
        return this.beanClassLoader;
    }

}
