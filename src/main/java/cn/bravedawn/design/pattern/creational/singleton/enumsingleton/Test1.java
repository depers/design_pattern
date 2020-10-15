package cn.bravedawn.design.pattern.creational.singleton.enumsingleton;

import cn.bravedawn.design.pattern.creational.singleton.serializabledamage.HungrySingleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 应用层
 * @date : Created in 2020/10/13 22:44
 */
public class Test1 {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        /**
         * 测试枚举INSTANCE是否会被序列化破坏
         */

        EnumInstance instance = EnumInstance.getInstance();

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton_file"));
        oos.writeObject(instance);

        File file = new File("singleton_file");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        EnumInstance newInstance = (EnumInstance) ois.readObject();


        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance == newInstance);
    }
}
