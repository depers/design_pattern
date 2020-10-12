package cn.bravedawn.design.pattern.creational.singleton.staticinnerclass;

import cn.bravedawn.design.pattern.creational.singleton.lazydoublecheck.LazyDoubleCheckSingleton;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 线程
 * @date : Created in 2020/9/29 21:36
 */
public class T implements Runnable{
    @Override
    public void run() {
        StaticInnerClassSingleton instance = StaticInnerClassSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + " " + instance);
    }
}
