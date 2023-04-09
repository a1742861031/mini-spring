package cn.bobo.springframework.support;

import cn.bobo.springframework.BeansException;
import cn.bobo.springframework.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * @author by bobo
 * @Description 实例化Bean类
 * @Date 2023/4/9 11:27
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory {
    public InstantiationStrategy getInstantiationStrategy() {
        return instantiationStrategy;
    }

    private InstantiationStrategy instantiationStrategy = new CglibSubclassingInstantiationStrategy();

    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition, Object[] args) throws BeansException {
        Object bean = null;
        try {
            bean = createBeanInstance(beanName, beanDefinition, args);
        } catch (Exception e) {
            throw new BeansException("Instantiation of bean failed", e);
        }

        addSingleTon(beanName, bean);
        return bean;
    }

    protected Object createBeanInstance(String beanName, BeanDefinition beanDefinition, Object[] args) {
        Constructor constructorToUser = null;
        Class<?> beanClass = beanDefinition.getBeanClass();
        Constructor<?>[] declaredConstructors = beanClass.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            if (null != args && declaredConstructor.getParameterTypes().length == args.length) {
                constructorToUser = declaredConstructor;
                break;
            }
        }
        return getInstantiationStrategy().instantiate(beanDefinition, beanName, constructorToUser, args);
    }
}
