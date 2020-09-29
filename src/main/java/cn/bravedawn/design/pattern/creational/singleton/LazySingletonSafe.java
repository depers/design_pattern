package cn.bravedawn.design.pattern.creational.singleton;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 懒汉式,线程安全
 * @date : Created in 2020/9/29 21:29
 */
public class LazySingletonSafe {

    // 1.在类加载时并不自行实例化，这种技术又称为延迟加载(Lazy Load)技术
    private static LazySingletonSafe lazySingleton = null;

    // 2.禁止外部实例化对象
    private LazySingletonSafe(){

    }

    // 3.提供实例化方法（线程安全）
    public synchronized static LazySingletonSafe getInstance(){
        if (lazySingleton == null){
            lazySingleton = new LazySingletonSafe();
        }
        return lazySingleton;
    }

    // 3.提供实例化方法，这个效果与上面相同，都是阻塞整个类
    /*
    public static LazySingletonSafe getInstance(){
        synchronized(LazySingletonSafe.class){
            if (lazySingleton == null){
                lazySingleton = new LazySingletonSafe();
            }
        }
        return lazySingleton;
    }
     */
}
