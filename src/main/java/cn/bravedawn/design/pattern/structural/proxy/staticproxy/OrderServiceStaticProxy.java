package cn.bravedawn.design.pattern.structural.proxy.staticproxy;

import cn.bravedawn.design.pattern.structural.proxy.IOrderService;
import cn.bravedawn.design.pattern.structural.proxy.Order;
import cn.bravedawn.design.pattern.structural.proxy.OrderServiceImpl;
import cn.bravedawn.design.pattern.structural.proxy.db.DataSourceContextHolder;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 订单service的静态代理
 * @date : Created in 2020/11/3 21:41
 */
public class OrderServiceStaticProxy {

    private IOrderService iOrderService;

    public int saveOrder(Order order){
        beforeMethod(order);
        iOrderService = new OrderServiceImpl();
        int result = iOrderService.saveOrder(order);
        afterMethod();
        return result;

    }

    public void beforeMethod(Order order){
        System.out.println("静态代理 before code");
        int userId = order.getUserId();
        int dbRouter = userId % 2;
        // todo 设置datasource
        DataSourceContextHolder.setDBType("db" + String.valueOf(dbRouter));
        System.out.println("静态代理分配到【db" + dbRouter + "】处理数据");
    }

    public void afterMethod(){
        System.out.println("静态代理 after code");
    }
}
