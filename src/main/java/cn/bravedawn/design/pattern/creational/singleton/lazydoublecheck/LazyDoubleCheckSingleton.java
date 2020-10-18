package cn.bravedawn.design.pattern.creational.singleton.lazydoublecheck;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 懒汉式双重检查单例
 * @date : Created in 2020/10/12 20:29
 */
public class LazyDoubleCheckSingleton {

    // 1.在类加载时并不自行实例化，这种技术又称为延迟加载(Lazy Load)技术
    // 1) 懒汉式单例在第一次调用getInstance()方法时实例化，在类加载时并不自行实例化，这种技术又称为延迟加载(Lazy Load)技术，即需要的时候再加载实例
    // 2) 使用volatile关键字规避指令重排
    private volatile static LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;

    // 2.禁止外部实例化对象
    private LazyDoubleCheckSingleton(){

    }

    // 3.提供实例化方法
    public static LazyDoubleCheckSingleton getInstance(){
        if (lazyDoubleCheckSingleton == null){
            synchronized (LazyDoubleCheckSingleton.class){
                if (lazyDoubleCheckSingleton == null){
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                    /**
                     * 上面这句代码实际上进行了三个操作
                     * 1. 分配内存
                     * 2. 初始化对象
                     * 3. 设置lazyDoubleCheckSingleton 指向刚分配的内存地址
                     * 值得注意的是第2步和第3步有可能会发生指令重排
                     */
                }
            }
        }
        return lazyDoubleCheckSingleton;
    }
}
