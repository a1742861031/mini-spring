package cn.bobo.springframework.context;

import cn.bobo.springframework.beans.BeansException;

/**
 * @author by bobo
 * @Description ConfigurableApplicationContext，提供了核心方法refresh
 * @Date 2023/4/29 18:40
 */
public interface ConfigurableApplicationContext extends ApplicationContext {
    /**
     * 刷新容器
     *
     * @throws BeansException BeansException
     */
    void refresh() throws BeansException;

    void registerShutdownHook();

    void close();
}
