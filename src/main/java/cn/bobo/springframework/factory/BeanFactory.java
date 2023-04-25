package cn.bobo.springframework.factory;

import cn.bobo.springframework.BeansException;

/**
 * @author by bobo
 * @Description Bean工厂
 * @Date 2023/4/22 21:48
 */
public interface BeanFactory {
    /**
     * 获取bean
     *
     * @param name bean名称
     * @return 对象
     * @throws BeansException 抛出异常
     */
    Object getBean(String name) throws BeansException;

    /**
     * 获取bean
     *
     * @param name bean名称
     * @param args 参数
     * @return 要获取的bean对象
     * @throws BeansException BeansException
     */
    Object getBean(String name, Object... args) throws BeansException;
}
