package cn.bravedawn.design.pattern.structural.facade;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 应用层
 * @date : Created in 2020/10/23 20:40
 */
public class Test {

    public static void main(String[] args) {
        PointsGift pointsGift = new PointsGift("T恤");
        GiftExchangeService giftExchangeService = new GiftExchangeService();
        giftExchangeService.giftExchange(pointsGift);
    }
}
