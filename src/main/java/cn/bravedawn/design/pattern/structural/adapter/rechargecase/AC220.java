package cn.bravedawn.design.pattern.structural.adapter.rechargecase;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 交流电220V，被适配者
 * @date : Created in 2020/10/26 22:00
 */
public class AC220 {

    public int outputAC220V(){
        int output = 220;
        System.out.println("输出交流电" + output + "V");
        return output;
    }
}
