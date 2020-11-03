package cn.bravedawn.design.pattern.structural.proxy;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 订单service实现
 * @date : Created in 2020/11/3 21:10
 */
public class OrderServiceImpl implements IOrderService{

    private IOrderDao iOrderDao;

    @Override
    public int saveOrder(Order order) {
        // Spring会自己注入，这里我们直接new
        iOrderDao = new OrderDapImpl();
        System.out.println("Service层调用Dao层添加Order.");
        return iOrderDao.insert(order);
    }
}
