package cn.bravedawn.design.pattern.structural.decorator.v2;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 煎饼类
 * @date : Created in 2020/10/25 12:21
 */
public class Battercake extends ABattercake{


    @Override
    protected String getDesc() {
        return "煎饼";
    }

    @Override
    protected int cost() {
        return 8;
    }
}
