package cn.bravedawn.design.pattern.behavioral.observer.guava;

import com.google.common.eventbus.EventBus;

/**
 * @author : depers
 * @program : design_pattern
 * @description: guava测试类
 * @date : Created in 2020/12/10 21:33
 */
public class GuavaEventTest {

    public static void main(String[] args) {
        EventBus eventBus = new EventBus();
        GuavaEvent guavaEvent = new GuavaEvent();
        eventBus.register(guavaEvent);
        eventBus.post("post的内容");

    }
}
