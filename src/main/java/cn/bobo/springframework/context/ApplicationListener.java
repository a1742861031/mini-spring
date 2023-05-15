package cn.bobo.springframework.context;

import java.util.EventListener;

/**
 * @author by bobo
 * @Description 应用监听器
 * @Date 2023/5/9 17:59
 */
public interface ApplicationListener<E extends ApplicationEvent> extends EventListener {

    /**
     * Handle an application event.
     *
     * @param event the event to respond to
     */
    void onApplicationEvent(E event);

}
