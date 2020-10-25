package cn.bravedawn.design.pattern.structural.decorator.v1;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 加蛋煎饼
 * @date : Created in 2020/10/25 11:26
 */
public class BattercakeWithEgg extends Battercake{

    @Override
    public String getDesc() {
        return super.getDesc() + " 加一个鸡蛋";
    }

    @Override
    public int cost() {
        return super.cost() + 1;
    }
}
