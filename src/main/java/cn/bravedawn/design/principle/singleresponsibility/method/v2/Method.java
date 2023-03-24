package cn.bravedawn.design.principle.singleresponsibility.method.v2;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 遵从单一职责原则的方法类
 * @date : Created in 2020/9/5 14:55
 */
public class Method {

    private void updateUserName(String userName){
        userName = "depers";
    }

    private void updateUserAddress(String address){
        address = "beijing";
    }

    private void updateOne(String property){
        property = "one";
    }

    private void updateTwo(String property){
        property = "two";
    }
}
