package cn.bobo.springframework.test.event;

import cn.bobo.springframework.context.ApplicationListener;

import java.util.Date;

/**
 * @author by bobo
 * @Description 用户自定义事件对应的监听器
 * @Date 2023/5/15 10:25
 */
public class CustomEventListener implements ApplicationListener<CustomEvent> {
    @Override
    public void onApplicationEvent(CustomEvent event) {
        System.out.println("收到：" + event.getSource() + "消息;时间：" + new Date());
        System.out.println("消息：" + event.getId() + ":" + event.getMessage());
    }

}
