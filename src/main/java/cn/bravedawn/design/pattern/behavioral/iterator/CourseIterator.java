package cn.bravedawn.design.pattern.behavioral.iterator;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 课程迭代器
 * @date : Created in 2020/11/10 21:10
 */
public interface CourseIterator {

    Course nextCourse();

    boolean isLastCourse();
}
