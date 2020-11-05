package cn.bravedawn.design.pattern.structural.proxy.dynamicproxy;

import cn.bravedawn.design.pattern.structural.proxy.Order;
import cn.bravedawn.design.pattern.structural.proxy.db.DataSourceContextHolder;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 订单服务动态代理
 * @date : Created in 2020/11/4 21:12
 */
public class OrderServiceDynamicProxy implements InvocationHandler {

    private Object target;

    // 第一步：注入被代理接口实现类
    public OrderServiceDynamicProxy(Object target){
        this.target = target;
    }

    // 第二步：通过JDK生成代理类
    public Object bind(){
        Class cls = target.getClass();
        return Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), this);
    }

    // 第三步：实现InvocationHandler接口，增强被代理接口方法
    // 在调用OrderService的saveOrder方法时，就会调用该方法
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object argObject = args[0];
        beforeMethod(argObject);
        Object object = method.invoke(target, args);
        afterMethod();
        return object;
    }

    public void beforeMethod(Object obj){
        int userId = 0;
        System.out.println("动态代理 before core");
        if (obj instanceof Order){
            Order order = (Order) obj;
            userId = order.getUserId();
        }
        int dbRouter = userId % 2;
        // todo 设置datasource
        DataSourceContextHolder.setDBType("db" + String.valueOf(dbRouter));
        System.out.println("动态代理分配到【db" + dbRouter + "】处理数据");
    }

    public void afterMethod(){
        System.out.println("动态代理 after code");
    }

}
