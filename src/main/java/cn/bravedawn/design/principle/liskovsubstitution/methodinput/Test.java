package cn.bravedawn.design.principle.liskovsubstitution.methodinput;

import java.util.HashMap;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 测试类
 * @date : Created in 2020/9/8 21:17
 */
public class Test {

    public static void main(String[] args) {

        // 情况一：Child的两个Method同时存在时
        Child child = new Child();
        HashMap hashMap = new HashMap();
        child.method(hashMap); // 子类HashMap入参方法被执行

        // 情况二：Child的Method(HashMap)方法被注释, 此时他会调用父类的method方法
        Child child2 = new Child();
        HashMap hashMap2 = new HashMap();
        child2.method(hashMap2); // 父类被执行
    }
}
