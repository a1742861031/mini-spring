package cn.bobo.springframework.context;

import cn.bobo.springframework.beans.factory.HierarchicalBeanFactory;
import cn.bobo.springframework.beans.factory.ListableBeanFactory;
import cn.bobo.springframework.core.io.ResourceLoader;

/**
 * @author by bobo
 * @Description 定义应用上下文
 * @Date 2023/4/29 18:32
 */

public interface ApplicationContext extends ListableBeanFactory, HierarchicalBeanFactory, ResourceLoader, ApplicationEventPublisher {
}
