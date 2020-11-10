package cn.bravedawn.design.pattern.behavioral.iterator;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 操作课程
 * @date : Created in 2020/11/10 21:08
 */
public interface CourseAggregate {

    void addCourse(Course course);

    void removeCourse(Course course);

    CourseIterator getCourseIterator();
}
