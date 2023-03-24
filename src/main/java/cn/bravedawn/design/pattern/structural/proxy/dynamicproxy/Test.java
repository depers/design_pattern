package cn.bravedawn.design.pattern.structural.proxy.dynamicproxy;

import cn.bravedawn.design.pattern.structural.proxy.IOrderService;
import cn.bravedawn.design.pattern.structural.proxy.Order;
import cn.bravedawn.design.pattern.structural.proxy.OrderServiceImpl;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 应用层
 * @date : Created in 2020/11/4 21:26
 */
public class Test {

    public static void main(String[] args) {
        Order order = new Order();
        order.setUserId(2);

        IOrderService orderServiceDynamicProxy = (IOrderService) new OrderServiceDynamicProxy(new OrderServiceImpl()).bind();
        orderServiceDynamicProxy.saveOrder(order);
    }
}
