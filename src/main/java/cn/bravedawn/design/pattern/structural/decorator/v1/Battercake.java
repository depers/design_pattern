package cn.bravedawn.design.pattern.structural.decorator.v1;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 煎饼类
 * @date : Created in 2020/10/25 11:24
 */
public class Battercake {

    /**
     * 获取描述
     * @return
     */
    protected String getDesc(){
        return "煎饼";
    }

    /**
     * 花费金额
     * @return
     */
    protected int cost(){
        return 8;
    }
}
