package cn.bravedawn.design.pattern.behavioral.strategy.v1;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 立减促销
 * @date : Created in 2020/11/17 21:37
 */
public class LiJianPromotionStrategy implements PromotionStrategy{

    @Override
    public void doPromotion() {
        System.out.println("立减促销，课程的价格直接减去配置的价格");
    }
}
