package cn.bravedawn.design.pattern.structural.decorator.v2;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 应用层
 * @date : Created in 2020/10/25 12:34
 */
public class Test {

    public static void main(String[] args) {
        ABattercake battercake;
        battercake = new Battercake();
        battercake = new EggDecorator(battercake);
        battercake = new SausageDecorator(battercake);
        battercake = new EggDecorator(battercake);
        System.out.println(battercake.getDesc() + "销售价格: " + battercake.cost());
    }
}
