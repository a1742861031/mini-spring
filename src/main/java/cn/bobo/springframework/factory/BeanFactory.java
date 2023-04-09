package cn.bobo.springframework.factory;

import cn.bobo.springframework.BeansException;

/**
 * @author by bobo
 * @Description bean工厂
 * @Date 2023/4/9 11:22
 */
public interface BeanFactory {

    Object getBean(String name) throws BeansException;


    Object getBean(String name, Object... args) throws BeansException;
}