package cn.bobo.springframework.context;

import cn.bobo.springframework.beans.BeansException;
import cn.bobo.springframework.beans.factory.ConfigurableListableBeanFactory;
import cn.bobo.springframework.beans.factory.config.BeanFactoryPostProcessor;
import cn.bobo.springframework.beans.factory.config.BeanPostProcessor;
import cn.bobo.springframework.beans.factory.supprt.ApplicationContextAwareProcessor;
import cn.bobo.springframework.core.io.DefaultResourceLoader;

import java.util.Map;

/**
 * @author by bobo
 * @Description 抽象应用上下文
 * @Date 2023/4/29 18:42
 */
public abstract class AbstractApplicationContext extends DefaultResourceLoader implements ConfigurableApplicationContext {
    @Override
    public void refresh() throws BeansException {
        //1、创建BeanFactory，并加载BeanDefinition
        refreshBeanFactory();
        //2、获取BeanFactory
        ConfigurableListableBeanFactory beanFactory = getBeanFactory();
        /*3、添加ApplicationContextAwareProcessor，
         让继承自ApplicationContext Aware 的 Bean 对象都能感知
        所属的 ApplicationContext
        */
        beanFactory.addBeanPostProcessor(new ApplicationContextAwareProcessor(this));
        //3、在实例化bean之前，执行BeanFactoryPostProcessor
        invokeBeanFactoryPostProcessor(beanFactory);
        //4、 BeanPostProcessor 需要提前于其他 Bean 对象实例化之前执行注册操作
        registerBeanPostProcessor(beanFactory);
        //5、提前实例化单例bean对象
        beanFactory.preInstantiateSingletons();
    }

    /**
     * 刷新BeanFactory
     *
     * @throws BeansException BeansException
     */
    protected abstract void refreshBeanFactory() throws BeansException;

    /**
     * 获取BeanFactory
     *
     * @return ConfigurableListableBeanFactory
     */
    protected abstract ConfigurableListableBeanFactory getBeanFactory();

    private void invokeBeanFactoryPostProcessor(ConfigurableListableBeanFactory beanFactory) {
        Map<String, BeanFactoryPostProcessor> beanFactoryPostProcessorMap = beanFactory.getBeansOfType(BeanFactoryPostProcessor.class);
        for (BeanFactoryPostProcessor beanFactoryPostProcessor : beanFactoryPostProcessorMap.values()) {
            beanFactoryPostProcessor.postProcessorBeanFactory(beanFactory);
        }
    }

    private void registerBeanPostProcessor(ConfigurableListableBeanFactory beanFactory) {
        Map<String, BeanPostProcessor> beanPostProcessorMap = beanFactory.getBeansOfType(BeanPostProcessor.class);
        for (BeanPostProcessor beanPostProcessor : beanPostProcessorMap.values()) {
            beanFactory.addBeanPostProcessor(beanPostProcessor);
        }
    }

    @Override
    public <T> Map<String, T> getBeansOfType(Class<T> type) throws BeansException {
        return getBeanFactory().getBeansOfType(type);
    }

    @Override
    public String[] getBeanDefinitionNames() {
        return getBeanFactory().getBeanDefinitionNames();
    }

    @Override
    public Object getBean(String name) throws BeansException {
        return getBeanFactory().getBean(name);
    }

    @Override
    public <T> T getBean(String name, Class<T> requiredType) throws BeansException {
        return getBeanFactory().getBean(name, requiredType);
    }

    @Override
    public void registerShutdownHook() {
        Runtime.getRuntime().addShutdownHook(new Thread(this::close));
    }

    @Override
    public void close() {
        getBeanFactory().destroySingletons();
    }
}
