package cn.bobo.springframework.factory.supprt;

import cn.bobo.springframework.BeansException;
import cn.bobo.springframework.factory.config.BeanDefinition;

import java.util.HashMap;
import java.util.Map;

/**
 * @author by bobo
 * @Description 核心实现类
 * @Date 2023/4/23 11:42
 */
public class DefaultListableBeanFactory extends AbstractAutowireCapableBeanFactory implements BeanDefinitionRegistry {
    private final Map<String, BeanDefinition> beanDefinitionMap = new HashMap<>();

    @Override
    protected BeanDefinition getBeanDefinition(String beanName) throws BeansException {
        BeanDefinition beanDefinition = beanDefinitionMap.get(beanName);

        if (beanDefinition == null) {
            throw new BeansException("No bean named '" + beanName + "' is defined");
        }
        return beanDefinition;
    }

    @Override
    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(beanName, beanDefinition);

    }
}
