package cn.bravedawn.design.pattern.structural.proxy;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 订单dao接口实现
 * @date : Created in 2020/11/3 21:07
 */
public class OrderDapImpl implements IOrderDao{

    @Override
    public int insert(Order order) {
        System.out.println("Dao层添加Order成功");
        return 1;
    }
}
