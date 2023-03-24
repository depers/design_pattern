package cn.bravedawn.design.pattern.creational.singleton.enumsingleton;

import cn.bravedawn.design.pattern.creational.singleton.reflectattack.HungrySingleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 应用层：测试枚举单例是否会被反射攻击
 * @date : Created in 2020/10/13 22:44
 */
public class Test3 {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        /**
         * 饿汉式单例反射攻击测试
         */
        Class objectClass = EnumInstance.class;

        // 这里会报: java.lang.NoSuchMethodException，原因是枚举没有无参构造器
        // Constructor constructor = objectClass.getDeclaredConstructor();

        // 这里调用Enum的有参构造器java.lang.Enum.Enum
        Constructor constructor = objectClass.getDeclaredConstructor(String.class, int.class);

        // 设置允许访问非public的构造器
        constructor.setAccessible(true);

        EnumInstance instance = EnumInstance.getInstance();
        // 这里会报: java.lang.IllegalArgumentException: Cannot reflectively create enum objects
        // 也就是说不能使用反射创建枚举对象，所以就不能进行反射攻击
        EnumInstance newInstance = (EnumInstance) constructor.newInstance("fengxiao", 666);

        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance == newInstance);
    }
}
