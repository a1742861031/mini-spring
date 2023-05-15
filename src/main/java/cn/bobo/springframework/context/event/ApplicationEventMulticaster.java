package cn.bobo.springframework.context.event;

import cn.bobo.springframework.context.ApplicationEvent;
import cn.bobo.springframework.context.ApplicationListener;

/**
 * @author by bobo
 * @Description 事件广播器
 * @Date 2023/5/9 17:53
 */
public interface ApplicationEventMulticaster {
    /**
     * Add a listener to be notified of all events.
     *
     * @param listener the listener to add
     */
    void addApplicationListener(ApplicationListener listener);

    /**
     * Remove a listener from the notification list.
     *
     * @param listener the listener to remove
     */
    void removeApplicationListener(ApplicationListener listener);

    /**
     * Multicast the given application event to appropriate listeners.
     *
     * @param event the event to multicast
     */
    void multicastEvent(ApplicationEvent event);
}
