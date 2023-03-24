package cn.bravedawn.design.pattern.creational.abstractfactory;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 课程工厂
 * @date : Created in 2020/9/20 10:22
 */
public interface CourseFactory {

    Video getVideo();

    Article getArticle();
}
