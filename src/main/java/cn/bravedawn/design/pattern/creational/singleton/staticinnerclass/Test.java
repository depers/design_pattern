package cn.bravedawn.design.pattern.creational.singleton.staticinnerclass;


/**
 * @author : depers
 * @program : design_pattern
 * @description: 应用层
 * @date : Created in 2020/9/29 21:33
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
