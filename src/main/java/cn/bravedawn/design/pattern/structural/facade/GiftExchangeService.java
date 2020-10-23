package cn.bravedawn.design.pattern.structural.facade;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 积分交换交易
 * @date : Created in 2020/10/23 20:38
 */
public class GiftExchangeService {

    private QualifyService qualifyService = new QualifyService();
    private PointsPaymentService pointsPaymentService = new PointsPaymentService();
    private ShippingService shippingService = new ShippingService();

    public void giftExchange(PointsGift pointsGift){
        // 资格校验
        if(qualifyService.isAvailable(pointsGift)){
            // 支付积分
            if(pointsPaymentService.pay(pointsGift)){
                // 发送物流
                String shippingOrderNo = shippingService.shipGift(pointsGift);
                System.out.println("物流系统下单成功,订单号是:"+shippingOrderNo);
            }
        }
    }
}
