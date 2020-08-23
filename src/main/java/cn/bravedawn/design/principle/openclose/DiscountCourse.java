package cn.bravedawn.design.principle.openclose;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 打折课程
 * @date : Created in 2020/8/23 18:36
 */
public class DiscountCourse extends Course{

    public DiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    /**
     * 返回原价
     * @return
     */
    public Double getOriginPrice(){
        return super.getPrice();
    }

    @Override
    public Double getPrice() {
        return super.getPrice() * 0.8;
    }
}
