package cn.bobo.springframework.context.event;

import cn.bobo.springframework.context.ApplicationContext;
import cn.bobo.springframework.context.ApplicationEvent;

/**
 * @author by bobo
 * @Description 应用上下文事件
 * @Date 2023/5/9 17:49
 */
public class ApplicationContextEvent extends ApplicationEvent {
    public ApplicationContextEvent(Object source) {
        super(source);
    }

    public final ApplicationContext getApplicationContext() {
        return (ApplicationContext) getSource();
    }
}
