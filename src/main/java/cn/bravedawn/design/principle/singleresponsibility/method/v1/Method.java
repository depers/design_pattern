package cn.bravedawn.design.principle.singleresponsibility.method.v1;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 方法类
 * @date : Created in 2020/9/5 14:50
 */
public class Method {

    /**
     * 下面的两个方法的定义就违背了单一职责原则，一个方法同时更新了多个字段
     */

    /**
     * 同时更新用户名和地址
     * @param userName 用户名
     * @param address 地址
     */
    private void updateUserInfo(String userName, String address){
        userName = "depers";
        address = "beijing";
    }

    /**
     * 更新用户名和其他的一些属性
     * @param userName 用户名
     * @param properties 其他属性
     */
    private void updateUserInfo(String userName, String... properties){
        userName = "depers";
    }

    /**
     * 根据布尔值在方法内部又进行了区分
     * @param property
     * @param flag
     */
    private void update(String property, boolean flag){
        if (flag){
            // todo something one
            property = "one";
        } else {
            // todo something two
            property = "two";
        }

    }
}
