package cn.bravedawn.design.pattern.behavioral.strategy.v2;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 空促销策略
 * @date : Created in 2020/11/17 21:59
 */
public class EmptyPromotionStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("无促销活动");
    }
}
