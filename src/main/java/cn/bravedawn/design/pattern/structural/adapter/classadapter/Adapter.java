package cn.bravedawn.design.pattern.structural.adapter.classadapter;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 适配器
 * @date : Created in 2020/10/26 21:36
 */
public class Adapter extends Adaptee implements Target{

    /**
     * 通过实现Target的request方法，继承Adaptee调用父类的adapteeRequest方法
     * 这里Adaptee通过Adapter实现了Target接口，而不是像ConcreteTarget自己实现Target接口
     */
    @Override
    public void request() {
        super.adapteeRequest();
    }
}
