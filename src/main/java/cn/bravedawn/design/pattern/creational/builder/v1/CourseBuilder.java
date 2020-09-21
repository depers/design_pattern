package cn.bravedawn.design.pattern.creational.builder.v1;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 课程建造者，Builder（抽象建造者）
 * @date : Created in 2020/9/21 20:15
 */
public abstract class CourseBuilder {

    public abstract void buildCourseName(String courseName);
    public abstract void buildCoursePPT(String coursePPT);
    public abstract void buildCourseVideo(String courseVideo);
    public abstract void buildCourseArticle(String courseArticle);
    public abstract void buildCourseQA(String courseQA);

    public abstract Course makeCourse();
}
