package cn.bravedawn.design.pattern.creational.singleton.threadlocal;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 线程
 * @date : Created in 2020/9/29 21:36
 */
public class T implements Runnable{
    @Override
    public void run() {
        ThreadLocalInstance instance = ThreadLocalInstance.getInstance();
        System.out.println(Thread.currentThread().getName() + " " + instance);
    }
}
