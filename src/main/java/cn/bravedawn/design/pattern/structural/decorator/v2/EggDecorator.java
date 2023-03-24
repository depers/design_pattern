package cn.bravedawn.design.pattern.structural.decorator.v2;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 鸡蛋装饰器
 * @date : Created in 2020/10/25 12:26
 */
public class EggDecorator extends AbstractDecorator{

    public EggDecorator(ABattercake battercake) {
        super(battercake);
    }

    @Override
    protected void doSomething() {

    }

    @Override
    protected String getDesc() {
        return super.getDesc() + " 加一个鸡蛋";
    }

    @Override
    protected int cost() {
        return super.cost() + 1;
    }
}
