package cn.bobo.springframework.beans.factory.supprt;

import cn.bobo.springframework.beans.core.io.DefaultResourceLoader;
import cn.bobo.springframework.beans.core.io.ResourceLoader;

/**
 * @author by bobo
 * @Description Bean定义读取抽象类实现
 * @Date 2023/4/25 15:30
 */
public abstract class AbstractBeanDefinitionReader implements BeanDefinitionReader {
    private final BeanDefinitionRegistry registry;
    private final ResourceLoader resourceLoader;

    protected AbstractBeanDefinitionReader(BeanDefinitionRegistry registry) {
        this(registry, new DefaultResourceLoader());
    }

    public AbstractBeanDefinitionReader(BeanDefinitionRegistry registry, ResourceLoader resourceLoader) {
        this.registry = registry;
        this.resourceLoader = resourceLoader;
    }

    @Override
    public BeanDefinitionRegistry getRegistry() {
        return registry;
    }

    @Override
    public ResourceLoader getResourceLoader() {
        return resourceLoader;
    }

}
