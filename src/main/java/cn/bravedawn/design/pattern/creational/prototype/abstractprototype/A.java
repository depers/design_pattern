package cn.bravedawn.design.pattern.creational.prototype.abstractprototype;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 抽象类
 * @date : Created in 2020/10/20 21:29
 */
public abstract class A implements Cloneable{

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
