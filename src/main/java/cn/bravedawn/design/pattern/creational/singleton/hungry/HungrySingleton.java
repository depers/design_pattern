package cn.bravedawn.design.pattern.creational.singleton.hungry;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 饿汉式单例模式
 * @date : Created in 2020/10/13 21:07
 */
public class HungrySingleton {

    private final static HungrySingleton hungrySingleton;

    private HungrySingleton() {}

    static {
        hungrySingleton = new HungrySingleton();
    }

    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }
}
