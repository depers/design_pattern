package cn.bravedawn.design.pattern.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 应用层
 * @date : Created in 2020/12/24 20:24
 */
public class Test {

    public static void main(String[] args) {
        List<Course> courseList = new ArrayList<Course>();

        FreeCourse freeCourse = new FreeCourse();
        freeCourse.setName("Spring Mvc数据绑定");

        CodingCourse codingCourse = new CodingCourse();
        codingCourse.setName("Java设计模式精讲");
        codingCourse.setPrice(299);

        courseList.add(freeCourse);
        courseList.add(codingCourse);

        for (Course course : courseList) {
            course.accept(new Visitor());
        }
    }
}
