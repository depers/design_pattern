package cn.bravedawn.design.pattern.creational.singleton.enumsingleton;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 应用层：测试枚举方法
 * @date : Created in 2020/10/18 9:55
 */
public class Test4 {

    public static void main(String[] args) {
        EnumInstance instance = EnumInstance.getInstance();
        instance.print();
        instance.print2();
    }
}
