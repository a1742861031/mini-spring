package cn.bobo.springframework.context.event;

/**
 * @author by bobo
 * @Description 容器关闭事件
 * @Date 2023/5/9 17:51
 */
public class ContextClosedEvent extends ApplicationContextEvent {
    public ContextClosedEvent(Object source) {
        super(source);
    }
}
