package cn.bravedawn.design.pattern.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : depers
 * @program : design_pattern
 * @description: CourseAggregate实现类
 * @date : Created in 2020/11/10 21:11
 */
public class CourseAggregateImpl implements CourseAggregate{

    private List courseList;

    public CourseAggregateImpl() {
        this.courseList = new ArrayList();
    }

    @Override
    public void addCourse(Course course) {
        courseList.add(course);
    }

    @Override
    public void removeCourse(Course course) {
        courseList.remove(course);
    }

    @Override
    public CourseIterator getCourseIterator() {
        return new CourseIteratorImpl(courseList);
    }
}
