package cn.bravedawn.design.pattern.creational.prototype.abstractprototype;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 继承类
 * @date : Created in 2020/10/20 21:30
 */
public class B extends A{

    /**
     * A实现了克隆方法，B继承了A，B自然就有了克隆的功能
     */
    public static void main(String[] args) throws CloneNotSupportedException {
        B b = new B();
        b.clone(); // 这里会调用A的克隆方法
    }
}
