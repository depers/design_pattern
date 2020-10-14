package cn.bravedawn.design.pattern.creational.singleton.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 应用层
 * @date : Created in 2020/10/13 22:44
 */
public class StaticTest {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        /**
         * 基于静态内部类的单例反射攻击
         */
        Class objectStaticClass = StaticInnerClassSingleton.class;
        Constructor staticConstructor = objectStaticClass.getDeclaredConstructor();
        // 设置允许访问非public的构造器
        staticConstructor.setAccessible(true);
        StaticInnerClassSingleton staticInstance = StaticInnerClassSingleton.getInstance();
        StaticInnerClassSingleton staticNewInstance = (StaticInnerClassSingleton) staticConstructor.newInstance();

        System.out.println(staticInstance);
        System.out.println(staticNewInstance);
        System.out.println(staticInstance == staticNewInstance);
    }
}
