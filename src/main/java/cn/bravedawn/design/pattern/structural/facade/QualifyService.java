package cn.bravedawn.design.pattern.structural.facade;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 校验类：是否有资格
 * @date : Created in 2020/10/23 20:35
 */
public class QualifyService {

    public boolean isAvailable(PointsGift pointsGift) {
        System.out.println("校验"+pointsGift.getName()+"积分资格通过,库存通过");
        return true;
    }
}
