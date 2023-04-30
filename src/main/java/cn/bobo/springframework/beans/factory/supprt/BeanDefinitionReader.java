package cn.bobo.springframework.beans.factory.supprt;

import cn.bobo.springframework.beans.BeansException;
import cn.bobo.springframework.core.io.Resource;
import cn.bobo.springframework.core.io.ResourceLoader;

/**
 * @author by bobo
 * @Description Bean定义读取接口
 * @Date 2023/4/25 15:27
 */
public interface BeanDefinitionReader {
    BeanDefinitionRegistry getRegistry();

    ResourceLoader getResourceLoader();

    void loadBeanDefinitions(Resource resource) throws BeansException;

    void loadBeanDefinitions(Resource... resources) throws BeansException;

    void loadBeanDefinitions(String location) throws BeansException;
    void loadBeanDefinitions(String... location) throws BeansException;
}
