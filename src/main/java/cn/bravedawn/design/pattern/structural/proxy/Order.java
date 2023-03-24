package cn.bravedawn.design.pattern.structural.proxy;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 订单
 * @date : Created in 2020/11/3 21:04
 */
public class Order {

    private Object orderInfo;
    private Integer userId;

    public Object getOrderInfo() {
        return orderInfo;
    }

    public void setOrderInfo(Object orderInfo) {
        this.orderInfo = orderInfo;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
