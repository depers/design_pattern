package cn.bravedawn.design.pattern.creational.singleton.reflect;

import java.io.Serializable;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 饿汉式单例模式
 * @date : Created in 2020/10/13 21:07
 */
public class HungrySingleton implements Serializable{

    private final static HungrySingleton hungrySingleton;

    static {
        hungrySingleton = new HungrySingleton();
    }

    private HungrySingleton(){
        // 避免反射攻击
        if (hungrySingleton != null) {
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }

    private Object readResolve(){
        return hungrySingleton;
    }
}
