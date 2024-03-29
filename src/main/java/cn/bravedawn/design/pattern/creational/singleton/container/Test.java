package cn.bravedawn.design.pattern.creational.singleton.container;


/**
 * @author : depers
 * @program : design_pattern
 * @description: 应用层：多线程测试
 * @date : Created in 2020/10/18 10:15
 */
public class Test {

    public static void main(String[] args) {
        Thread t1 = new Thread(new T());
        Thread t2 = new Thread(new T());
        t1.start();
        t2.start();
        System.out.println("program end.");
    }
}
