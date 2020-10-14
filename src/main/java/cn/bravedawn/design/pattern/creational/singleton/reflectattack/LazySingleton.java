package cn.bravedawn.design.pattern.creational.singleton.reflectattack;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 懒汉式,线程不安全
 * @date : Created in 2020/9/29 21:29
 */
public class LazySingleton {

    // 1.在类加载时并不自行实例化，这种技术又称为延迟加载(Lazy Load)技术
    // 懒汉式单例在第一次调用getInstance()方法时实例化，在类加载时并不自行实例化，这种技术又称为延迟加载(Lazy Load)技术，即需要的时候再加载实例
    private static LazySingleton lazySingleton = null;

    // 2.禁止外部实例化对象
    // 方法一：在私有构造器里面添加实例判断
    /*
    private LazySingleton(){
        // 避免反射攻击
        if (lazySingleton != null) {
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }
    */

    // 方法二：通过添加标识字段规避方法一的问题，进而避免反射攻击
    private static boolean flag = true;

    private LazySingleton(){
        // 避免反射攻击
        if (flag) {
            flag = false;
        } else{
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    // 3.提供实例化方法（线程不安全的）
    public static LazySingleton getInstance(){
        if (lazySingleton == null){
            lazySingleton = new LazySingleton(); // 若线程1和线程2都进入到这里，就会存在重复创建对象的情况
        }
        return lazySingleton;
    }
}
