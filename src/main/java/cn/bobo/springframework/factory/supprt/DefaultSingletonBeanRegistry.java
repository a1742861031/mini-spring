package cn.bobo.springframework.factory.supprt;

import cn.bobo.springframework.factory.config.SingletonBeanRegistry;

import java.util.HashMap;
import java.util.Map;

/**
 * @author by bobo
 * @Description singleton bean注册和获取
 * @Date 2023/4/22 22:01
 */
public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {

    private final Map<String, Object> singletonObjects = new HashMap<>();


    protected void addSingleton(String beanName, Object singletonObject) {
        singletonObjects.put(beanName, singletonObject);
    }

    @Override
    public Object getSingleTon(String beanName) {
        return singletonObjects.get(beanName);
    }
}
