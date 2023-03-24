package cn.bravedawn.design.pattern.creational.abstractfactory;

/**
 * @author : depers
 * @program : design_pattern
 * @description: Java课程工厂类
 * @date : Created in 2020/9/20 10:24
 */
public class JavaCourseFactory implements CourseFactory{


    @Override
    public Video getVideo() {
        return new JavaVideo();
    }

    @Override
    public Article getArticle() {
        return new JavaArticle();
    }
}
