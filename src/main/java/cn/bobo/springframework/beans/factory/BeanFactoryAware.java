package cn.bobo.springframework.beans.factory;

import cn.bobo.springframework.beans.BeansException;

/**
 * @author by bobo
 * @Description 容器感知类
 * @Date 2023/5/9 15:29
 */
public interface BeanFactoryAware extends Aware {
    /**
     * 实现此接口，即能感知到所属的BeanFactory
     */
    void setBeanFactory(BeanFactory beanFactory) throws BeansException;
}
