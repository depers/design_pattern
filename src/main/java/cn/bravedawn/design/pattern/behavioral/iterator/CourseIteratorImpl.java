package cn.bravedawn.design.pattern.behavioral.iterator;

import java.util.List;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 课程迭代器实现类
 * @date : Created in 2020/11/10 21:15
 */
public class CourseIteratorImpl implements CourseIterator{

    private List courseList;
    private int position;
    private Course course;

    public CourseIteratorImpl(List courseList) {
        this.courseList = courseList;
    }

    @Override
    public Course nextCourse() {
        System.out.println("返回课程，位置是：" + position);
        course = (Course) courseList.get(position);
        position++;
        return course;
    }

    @Override
    public boolean isLastCourse() {
        if (position < courseList.size()){
            return false;
        }
        return true;
    }
}
