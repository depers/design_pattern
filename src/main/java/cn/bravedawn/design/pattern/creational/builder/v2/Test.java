package cn.bravedawn.design.pattern.creational.builder.v2;

import com.google.common.collect.ImmutableSet;

import java.util.Set;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 客户端
 * @date : Created in 2020/9/21 21:13
 */
public class Test {

    public static void main(String[] args) {
        // 链式调用
        Course course = new Course.CourseBuilder()
                                .buildCourseName("Java设计模式精讲")
                                .buildCoursePPT("Java设计模式精讲PPT")
                                .build();
        System.out.println(course);

        Set<String> stringSet = ImmutableSet.<String>builder().add("a").add("b").build();
    }
}
