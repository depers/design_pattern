package cn.bravedawn.design.pattern.creational.singleton.container;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 线程
 * @date : Created in 2020/9/29 21:36
 */
public class T implements Runnable{
    @Override
    public void run() {
        ContainerSingleton.putInstance("object", new Object());
        Object instance = ContainerSingleton.getInstance("object");
        System.out.println(Thread.currentThread().getName() + " " + instance);
    }
}
