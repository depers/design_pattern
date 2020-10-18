package cn.bravedawn.design.pattern.creational.singleton.threadlocal;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 线程唯一的单例
 * @date : Created in 2020/10/18 10:44
 */
public class ThreadLocalInstance {

    public static final ThreadLocal<ThreadLocalInstance> threadLocalInstance
            = new ThreadLocal<ThreadLocalInstance>(){

        @Override
        protected ThreadLocalInstance initialValue() {
            return new ThreadLocalInstance();
        }
    };

    private ThreadLocalInstance(){}

    public static ThreadLocalInstance getInstance(){
        return threadLocalInstance.get();
    }
}
