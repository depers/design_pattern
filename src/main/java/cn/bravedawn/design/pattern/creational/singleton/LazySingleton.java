package cn.bravedawn.design.pattern.creational.singleton;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 懒汉式,线程不安全
 * @date : Created in 2020/9/29 21:29
 */
public class LazySingleton {

    // 1.在类加载时并不自行实例化，这种技术又称为延迟加载(Lazy Load)技术
    private static LazySingleton lazySingleton = null;

    // 2.禁止外部实例化对象
    private LazySingleton(){

    }

    // 3.提供实例化方法（线程不安全的）
    public static LazySingleton getInstance(){
        if (lazySingleton == null){
            lazySingleton = new LazySingleton(); // 若线程1和线程2都进入到这里，就会存在重复创建对象的情况
        }
        return lazySingleton;
    }
}
