package cn.bravedawn.design.pattern.structural.facade;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 积分支付类
 * @date : Created in 2020/10/23 20:36
 */
public class PointsPaymentService {

    public boolean pay(PointsGift pointsGift) {
        /** 扣减积分 */
        System.out.println("支付" + pointsGift.getName() + " 积分成功");
        return true;
    }
}
