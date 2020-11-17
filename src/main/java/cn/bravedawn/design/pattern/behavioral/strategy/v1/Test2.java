package cn.bravedawn.design.pattern.behavioral.strategy.v1;

import org.apache.commons.lang3.StringUtils;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 应用层
 * @date : Created in 2020/11/17 21:43
 */
public class Test2 {

    /**
     * 初级的策略模式并无法彻底消除条件判断语句
     * @param args
     */
    public static void main(String[] args) {
        PromotionActivity promotionActivity = null;
        String promotionKey = "LIJIAN";

        if (StringUtils.equals(promotionKey, "LIJIAN")){
            new PromotionActivity(new LiJianPromotionStrategy());
        } else if(StringUtils.equals(promotionKey, "MANJIAN")){
            new PromotionActivity(new ManJianPromotionStrategy());
        }
        //.....其他判断

        // 执行
        promotionActivity.executePromotionStrategy();

    }
}
