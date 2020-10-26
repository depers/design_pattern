package cn.bravedawn.design.pattern.structural.adapter.classadapter;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 具体的目标实现类，做对比用的
 * @date : Created in 2020/10/26 21:34
 */
public class ConcreteTarget implements Target{
    @Override
    public void request() {
        System.out.println("concreteTarget目标方法");
    }
}
