package cn.bravedawn.design.principle.openclose;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 打折课程
 * @date : Created in 2020/8/23 18:36
 */
public class DiscountCourseV2 extends Course{

    public DiscountCourseV2(Integer id, String name, Double price) {
        super(id, name, price);
    }

    /**
     * 返回原价
     * @return
     */
    public Double getOriginPrice(){
        return super.getPrice();
    }

    /**
     * 返回打折价格，应该单独扩展子类的方法去实现子类的功能
     * @return
     */
    public Double getDiscountPrice(){
        return super.getPrice() * 0.8;
    }

}
