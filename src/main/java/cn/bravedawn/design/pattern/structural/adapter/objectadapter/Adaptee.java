package cn.bravedawn.design.pattern.structural.adapter.objectadapter;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 被适配者（适配者类）
 * @date : Created in 2020/10/26 21:29
 */
public class Adaptee {

    public void adapteeRequest(){
        System.out.println("被适配者的方法");
    }
}
