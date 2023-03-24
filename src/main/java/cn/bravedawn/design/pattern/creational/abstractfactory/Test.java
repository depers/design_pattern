package cn.bravedawn.design.pattern.creational.abstractfactory;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 应用层
 * @date : Created in 2020/9/20 10:33
 */
public class Test {

    public static void main(String[] args) {
        CourseFactory courseFactory = new JavaCourseFactory();
        Video javaVideo = courseFactory.getVideo();
        Article javaArticle = courseFactory.getArticle();
        javaVideo.produce();
        javaArticle.produce();
    }
}
