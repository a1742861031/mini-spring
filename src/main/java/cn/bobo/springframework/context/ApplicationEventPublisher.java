package cn.bobo.springframework.context;

/**
 * @author by bobo
 * @Description 事件发布
 * @Date 2023/5/11 15:36
 */
public interface ApplicationEventPublisher {
    /**
     * 发布事件
     *
     * @param event 事件
     */
    void publishEvent(ApplicationEvent event);
}
