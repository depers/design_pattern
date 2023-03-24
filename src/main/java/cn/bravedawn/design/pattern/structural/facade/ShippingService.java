package cn.bravedawn.design.pattern.structural.facade;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 物流子系统
 * @date : Created in 2020/10/23 20:37
 */
public class ShippingService {

    public String shipGift(PointsGift pointsGift) {
        /** 物流系统对接逻辑 */
        System.out.println(pointsGift.getName() + "进入物流系统");
        String shippingOrderNo = "666";
        return shippingOrderNo;
    }
}
