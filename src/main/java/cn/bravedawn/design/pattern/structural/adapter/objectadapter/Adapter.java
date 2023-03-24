package cn.bravedawn.design.pattern.structural.adapter.objectadapter;


/**
 * @author : depers
 * @program : design_pattern
 * @description: 适配器
 * @date : Created in 2020/10/26 21:36
 */
public class Adapter implements Target {

    private Adaptee adaptee = new Adaptee();

    /**
     * 1.通过实现Target的request方法
     * 2.通过组合复用原则，实例化被适配者adaptee；并且使用委托机制将request方法的实现委托给adaptee
     */
    @Override
    public void request() {
        adaptee.adapteeRequest();
    }
}
