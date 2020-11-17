package cn.bravedawn.design.pattern.behavioral.strategy.v1;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 返现促销策略
 * @date : Created in 2020/11/17 21:38
 */
public class FanXianPromotionStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("返现促销，返回的金额存放到慕课网用户的余额中");
    }
}
