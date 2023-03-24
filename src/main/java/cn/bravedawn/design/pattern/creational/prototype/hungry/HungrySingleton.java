package cn.bravedawn.design.pattern.creational.prototype.hungry;

import java.io.Serializable;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 饿汉式单例模式
 * @date : Created in 2020/10/13 21:07
 */
public class HungrySingleton implements Serializable, Cloneable {

    private final static HungrySingleton hungrySingleton;

    static {
        hungrySingleton = new HungrySingleton();
    }

    private HungrySingleton(){}


    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }

    private Object readResolve(){
        return hungrySingleton;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return getInstance();
    }
}

