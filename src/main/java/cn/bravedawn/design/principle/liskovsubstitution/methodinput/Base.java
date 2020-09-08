package cn.bravedawn.design.principle.liskovsubstitution.methodinput;

import java.util.HashMap;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 基类
 * @date : Created in 2020/9/8 21:10
 */
public class Base {

    public void method(HashMap map){
        System.out.println("父类被执行");
    }

}
