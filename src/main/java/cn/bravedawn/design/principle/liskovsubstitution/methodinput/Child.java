package cn.bravedawn.design.principle.liskovsubstitution.methodinput;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 子类
 * @date : Created in 2020/9/8 21:11
 */
public class Child extends Base{

    @Override
    public void method(HashMap map) {
        System.out.println("子类HashMap入参方法被执行");
    }

    /**
     * 子类重载父类的方法，方法的前置条件（即方法的输入/入参）要比父类方法的输入参数更宽松（大于）
     */
    public void method(Map map) {
        System.out.println("子类Map入参方法被执行");
    }
}
