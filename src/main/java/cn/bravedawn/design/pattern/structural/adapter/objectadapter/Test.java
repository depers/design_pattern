package cn.bravedawn.design.pattern.structural.adapter.objectadapter;

import cn.bravedawn.design.pattern.structural.adapter.classadapter.Adapter;
import cn.bravedawn.design.pattern.structural.adapter.classadapter.ConcreteTarget;
import cn.bravedawn.design.pattern.structural.adapter.classadapter.Target;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 应用层
 * @date : Created in 2020/10/26 21:41
 */
public class Test {

    public static void main(String[] args) {
        // 直接实现接口实现
        Target target = new ConcreteTarget();
        target.request();

        // 通过适配器实现
        Target adapterTarget = new Adapter();
        adapterTarget.request();
    }
}
