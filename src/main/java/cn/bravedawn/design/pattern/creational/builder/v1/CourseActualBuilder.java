package cn.bravedawn.design.pattern.creational.builder.v1;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 课程真实的builder，ConcreteBuilder（具体建造者）
 * @date : Created in 2020/9/21 20:19
 */
public class CourseActualBuilder extends CourseBuilder{

    private Course course = new Course();

    @Override
    public void buildCourseName(String courseName) {
        course.setCourseName(courseName);
    }

    @Override
    public void buildCoursePPT(String coursePPT) {
        course.setCoursePPT(coursePPT);
    }

    @Override
    public void buildCourseVideo(String courseVideo) {
        course.setCourseVideo(courseVideo);
    }

    @Override
    public void buildCourseArticle(String courseArticle) {
        course.setCourseArticle(courseArticle);
    }

    @Override
    public void buildCourseQA(String courseQA) {
        course.setCourseQA(courseQA);
    }

    @Override
    public Course makeCourse() {
        return course;
    }
}
