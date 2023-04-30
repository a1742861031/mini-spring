package cn.bobo.springframework.context;

import cn.bobo.springframework.beans.factory.supprt.DefaultListableBeanFactory;
import cn.bobo.springframework.beans.factory.xml.XmlBeanDefinitionReader;

/**
 * @author by bobo
 * @Description 上下文中配置信息的加载
 * @Date 2023/4/30 12:51
 */
public abstract class AbstractXmlApplicationContext extends AbstractRefreshableApplicationContext {
    @Override
    protected void loadBeanDefinition(DefaultListableBeanFactory beanFactory) {
        XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanFactory, this);
        String[] configLocations = getConfigLocations();
        if (null != configLocations) {
            beanDefinitionReader.loadBeanDefinitions(configLocations);
        }
    }

    /**
     * 从入口上下文类，拿到配置信息的地址描述
     */
    protected abstract String[] getConfigLocations();
}
