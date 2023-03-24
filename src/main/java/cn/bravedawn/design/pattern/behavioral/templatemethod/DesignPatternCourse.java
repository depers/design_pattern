package cn.bravedawn.design.pattern.behavioral.templatemethod;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 设计模式课程
 * @date : Created in 2020/11/5 21:30
 */
public class DesignPatternCourse extends ACourse{


    @Override
    void packageCourse() {
        System.out.println("提供课程Java源代码");
    }

    @Override
    protected boolean needWriteArticle() {
        return true;
    }
}
