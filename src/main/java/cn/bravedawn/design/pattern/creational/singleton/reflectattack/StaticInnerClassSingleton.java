package cn.bravedawn.design.pattern.creational.singleton.reflectattack;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 静态内部类的单例模式
 * @date : Created in 2020/10/12 21:23
 */
public class StaticInnerClassSingleton {

    private StaticInnerClassSingleton(){
        // 避免反射攻击
        if (InnerClass.staticInnerClassSingleton != null) {
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    private static class InnerClass{
        private static StaticInnerClassSingleton staticInnerClassSingleton = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance(){
        return InnerClass.staticInnerClassSingleton;
    }
}
