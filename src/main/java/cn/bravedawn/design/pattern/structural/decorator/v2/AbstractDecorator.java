package cn.bravedawn.design.pattern.structural.decorator.v2;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 装饰器类
 * @date : Created in 2020/10/25 12:23
 */
public abstract class AbstractDecorator extends ABattercake{

    private ABattercake battercake;

    public AbstractDecorator(ABattercake battercake) {
        this.battercake = battercake;
    }

    protected abstract void doSomething();

    @Override
    protected String getDesc() {
        return this.battercake.getDesc();
    }

    @Override
    protected int cost() {
        return this.battercake.cost();
    }
}
