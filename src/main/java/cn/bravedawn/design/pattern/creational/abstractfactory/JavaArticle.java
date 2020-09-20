package cn.bravedawn.design.pattern.creational.abstractfactory;

/**
 * @author : depers
 * @program : design_pattern
 * @description: Java手记
 * @date : Created in 2020/9/20 10:26
 */
public class JavaArticle extends Article{

    @Override
    public void produce() {
        System.out.println("编写Java课程手记");
    }
}
