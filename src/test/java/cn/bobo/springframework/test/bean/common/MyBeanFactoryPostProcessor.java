package cn.bobo.springframework.test.bean.common;

import cn.bobo.springframework.beans.BeansException;
import cn.bobo.springframework.beans.PropertyValue;
import cn.bobo.springframework.beans.PropertyValues;
import cn.bobo.springframework.beans.factory.ConfigurableListableBeanFactory;
import cn.bobo.springframework.beans.factory.config.BeanDefinition;
import cn.bobo.springframework.beans.factory.config.BeanFactoryPostProcessor;

/**
 * @author by bobo
 * @Description 自定义增强
 * @Date 2023/4/30 13:13
 */
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessorBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        BeanDefinition beanDefinition = beanFactory.getBeanDefinition("userService");
        PropertyValues propertyValues = beanDefinition.getPropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("company", "改为：字节跳动"));
    }
}
