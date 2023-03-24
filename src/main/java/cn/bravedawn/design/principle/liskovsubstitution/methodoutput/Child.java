package cn.bravedawn.design.principle.liskovsubstitution.methodoutput;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 子类
 * @date : Created in 2020/9/8 21:26
 */
public class Child extends Base{


    /**
     * 当子类的方法实现父类的方法时（重写/重载或实现抽象方法），
     * 方法的后置条件（即方法的输出/返回值）要比父类更严格或相等（小于等于）
     */
    public HashMap method() {
        HashMap hashMap = new HashMap();
        System.out.println("子类方法被执行");
        hashMap.put("message", "子类方法被执行");
        return hashMap;
    }
}
