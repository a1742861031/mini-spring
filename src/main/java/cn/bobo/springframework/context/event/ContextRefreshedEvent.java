package cn.bobo.springframework.context.event;

/**
 * @author by bobo
 * @Description 上下文刷新事件
 * @Date 2023/5/11 15:38
 */
public class ContextRefreshedEvent extends ApplicationContextEvent {
    public ContextRefreshedEvent(Object source) {
        super(source);
    }
}
