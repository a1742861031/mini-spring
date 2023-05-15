package cn.bobo.springframework.context;

import java.util.EventObject;

/**
 * @author by bobo
 * @Description 抽象类，后序所有的事件类都要继承这个类
 * @Date 2023/5/9 17:48
 */
public abstract class ApplicationEvent extends EventObject {
    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public ApplicationEvent(Object source) {
        super(source);
    }
}
