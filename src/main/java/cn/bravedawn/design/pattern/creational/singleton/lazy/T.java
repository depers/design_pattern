package cn.bravedawn.design.pattern.creational.singleton.lazy;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 线程
 * @date : Created in 2020/9/29 21:36
 */
public class T implements Runnable{
    @Override
    public void run() {
        LazySingleton lazySingleton = LazySingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + " " + lazySingleton);
    }
}
