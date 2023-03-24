package cn.bravedawn.design.pattern.behavioral.strategy.v1;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 促销活动
 * @date : Created in 2020/11/17 21:41
 */
public class PromotionActivity {

    private PromotionStrategy promotionStrategy;

    public PromotionActivity(PromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }

    public void executePromotionStrategy(){
        this.promotionStrategy.doPromotion();
    }
}
