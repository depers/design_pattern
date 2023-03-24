package cn.bravedawn.design.pattern.structural.decorator.v1;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 加蛋加香肠煎饼
 * @date : Created in 2020/10/25 11:29
 */
public class BattercakeWithEggSausage extends BattercakeWithEgg{
    @Override
    public String getDesc() {
        return super.getDesc() + " 加一根香肠";
    }

    @Override
    public int cost() {
        return super.cost() + 2;
    }
}
