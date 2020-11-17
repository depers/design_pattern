package cn.bravedawn.design.pattern.behavioral.strategy.v2;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 满减促销
 * @date : Created in 2020/11/17 21:37
 */
public class ManJianPromotionStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("满减促销，满200-20元");
    }
}
