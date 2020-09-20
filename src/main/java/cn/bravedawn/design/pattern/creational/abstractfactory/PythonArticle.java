package cn.bravedawn.design.pattern.creational.abstractfactory;

/**
 * @author : depers
 * @program : design_pattern
 * @description: Python手记
 * @date : Created in 2020/9/20 10:30
 */
public class PythonArticle extends Article{
    @Override
    public void produce() {
        System.out.println("编写Python课程手记");
    }
}
