package cn.bravedawn.design.principle.liskovsubstitution.methodoutput;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 测试类
 * @date : Created in 2020/9/8 21:28
 */
public class Test {

    public static void main(String[] args) {
        Child child = new Child();
        System.out.println(child.method());
    }
}
