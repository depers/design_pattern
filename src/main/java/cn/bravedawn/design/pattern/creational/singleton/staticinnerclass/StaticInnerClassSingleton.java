package cn.bravedawn.design.pattern.creational.singleton.staticinnerclass;

import java.sql.SQLOutput;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 静态内部类的单例模式
 * @date : Created in 2020/10/12 21:23
 */
public class StaticInnerClassSingleton {

    private StaticInnerClassSingleton(){}

    private static class InnerClass{
        private static StaticInnerClassSingleton staticInnerClassSingleton = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance(){
        return InnerClass.staticInnerClassSingleton;
    }
}
