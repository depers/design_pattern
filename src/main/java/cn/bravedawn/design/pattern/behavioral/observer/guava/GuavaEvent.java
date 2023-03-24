package cn.bravedawn.design.pattern.behavioral.observer.guava;

import com.google.common.eventbus.Subscribe;

/**
 * @author : depers
 * @program : design_pattern
 * @description: guava事件
 * @date : Created in 2020/12/10 21:29
 */
public class GuavaEvent {

    @Subscribe
    public void subscribe(String str){
        System.out.println("执行subscribe方法，传入的参数是：" + str);
    }
}
