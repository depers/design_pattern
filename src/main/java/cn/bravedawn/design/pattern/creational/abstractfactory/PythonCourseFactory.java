package cn.bravedawn.design.pattern.creational.abstractfactory;

/**
 * @author : depers
 * @program : design_pattern
 * @description: Python课程工厂
 * @date : Created in 2020/9/20 10:29
 */
public class PythonCourseFactory implements CourseFactory{
    @Override
    public Video getVideo() {
        return null;
    }

    @Override
    public Article getArticle() {
        return null;
    }
}
