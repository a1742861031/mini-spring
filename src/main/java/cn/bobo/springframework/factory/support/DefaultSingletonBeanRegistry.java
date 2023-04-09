package cn.bobo.springframework.factory.support;

import cn.bobo.springframework.factory.config.SingletonBeanRegistry;

import java.util.HashMap;
import java.util.Map;

/**
 * @author by bobo
 * @Description 注册单例bean到ioc容器
 * @Date 2023/4/9 11:19
 */
public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {
    private Map<String, Object> singletonObjects = new HashMap<>();

    @Override
    public Object getSingleton(String beanName) {
        return singletonObjects.get(beanName);
    }

    protected void addSingleTon(String beanName, Object singletonObject) {
        singletonObjects.put(beanName, singletonObject);
    }

}
