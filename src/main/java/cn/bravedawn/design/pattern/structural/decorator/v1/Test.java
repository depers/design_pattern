package cn.bravedawn.design.pattern.structural.decorator.v1;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 应用层
 * @date : Created in 2020/10/25 11:31
 */
public class Test {

    public static void main(String[] args) {
        Battercake battercake = new Battercake();
        System.out.println(battercake.getDesc() + "销售价格: " + battercake.cost());

        Battercake battercakeWithEgg = new BattercakeWithEgg();
        System.out.println(battercakeWithEgg.getDesc() + "销售价格: " + battercakeWithEgg.cost());

        Battercake battercakeWithEggSausage = new BattercakeWithEggSausage();
        System.out.println(battercakeWithEggSausage.getDesc() + "销售价格: " + battercakeWithEggSausage.cost());
    }
}
