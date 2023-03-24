package cn.bravedawn.design.pattern.creational.singleton.enumsingleton;

import java.io.*;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 应用层
 * @date : Created in 2020/10/13 22:44
 */
public class Test2 {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        /**
         * 测试枚举INSTANCE的data属性是否会被序列化破坏
         */

        EnumInstance instance = EnumInstance.getInstance();
        instance.setData(new Object());

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton_file"));
        oos.writeObject(instance);

        File file = new File("singleton_file");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        EnumInstance newInstance = (EnumInstance) ois.readObject();


        System.out.println(instance.getData());
        System.out.println(newInstance.getData());
        System.out.println(instance.getData() == newInstance.getData());
    }
}
