package cn.bobo.springframework.beans.factory.supprt;

import cn.bobo.springframework.beans.BeansException;
import cn.bobo.springframework.beans.factory.FactoryBean;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import static cn.bobo.springframework.beans.factory.supprt.DefaultSingletonBeanRegistry.NULL_OBJECT;

/**
 * @author by bobo
 * @Description FactoryBean 注册服务
 * @Date 2023/5/9 16:26
 */
public abstract class FactoryBeanRegistrySupport extends DefaultSingletonBeanRegistry{
    private final Map<String, Object> factoryBeanObjectCache = new ConcurrentHashMap<>();

    protected Object getCachedObjectForFactoryBean(String beanName) {
        Object object = this.factoryBeanObjectCache.get(beanName);
        return object != NULL_OBJECT ? object : null;
    }

    protected Object getObjectFromFactoryBean(FactoryBean factory, String beanName) {
        if (!factory.isSingleton()) {
            Object object = this.factoryBeanObjectCache.get(beanName);
            if (object == null) {
                object = doGetObjectFromBeanFactory(factory, beanName);
                this.factoryBeanObjectCache.put(beanName, (object != null ? object : NULL_OBJECT));
            }
            return (object != NULL_OBJECT ? object : null);
        } else {
            return doGetObjectFromBeanFactory(factory, beanName);
        }
    }

    private Object doGetObjectFromBeanFactory(final FactoryBean factory, final String beanName) {
        try {
            return factory.getObject();
        } catch (Exception e) {
            throw new BeansException("FactoryBean threw exception on object[" + beanName + "] creation");
        }
    }
}
