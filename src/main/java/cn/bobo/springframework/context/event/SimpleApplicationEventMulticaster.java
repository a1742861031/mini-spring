package cn.bobo.springframework.context.event;

import cn.bobo.springframework.beans.factory.BeanFactory;
import cn.bobo.springframework.context.ApplicationEvent;
import cn.bobo.springframework.context.ApplicationListener;

/**
 * @author by bobo
 * @Description 事件广播
 * @Date 2023/5/11 15:41
 */
public class SimpleApplicationEventMulticaster extends AbstractApplicationEventMulticaster {
    public SimpleApplicationEventMulticaster(BeanFactory beanFactory) {
        setBeanFactory(beanFactory);
    }

    @Override
    public void multicastEvent(final ApplicationEvent event) {
        for (final ApplicationListener listener : getApplicationListeners(event)) {
            listener.onApplicationEvent(event);
        }
    }
}
