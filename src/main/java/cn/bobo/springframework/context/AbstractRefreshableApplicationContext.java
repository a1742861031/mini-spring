package cn.bobo.springframework.context;

import cn.bobo.springframework.beans.BeansException;
import cn.bobo.springframework.beans.factory.ConfigurableListableBeanFactory;
import cn.bobo.springframework.beans.factory.supprt.DefaultListableBeanFactory;

/**
 * @author by bobo
 * @Description 获取Bean工厂和加载资源
 * @Date 2023/4/30 12:34
 */
public abstract class AbstractRefreshableApplicationContext extends AbstractApplicationContext {
    private DefaultListableBeanFactory beanFactory;

    @Override
    public Object getBean(String name, Object... args) throws BeansException {
        return null;
    }

    @Override
    protected void refreshBeanFactory() throws BeansException {
        DefaultListableBeanFactory beanFactory = createBeanFactory();
        loadBeanDefinition(beanFactory);
        this.beanFactory = beanFactory;
    }

    protected DefaultListableBeanFactory createBeanFactory() {
        return new DefaultListableBeanFactory();
    }

    @Override
    protected ConfigurableListableBeanFactory getBeanFactory() {
        return beanFactory;
    }

    /**
     * 加载beanDefinition
     *
     * @param beanFactory beanFactory
     */
    protected abstract void loadBeanDefinition(DefaultListableBeanFactory beanFactory);
}
