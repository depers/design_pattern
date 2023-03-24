package cn.bravedawn.design.pattern.creational.builder.v1;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 客户端
 * @date : Created in 2020/9/21 20:45
 */
public class Test {

    public static void main(String[] args) {
        CourseBuilder courseBuilder = new CourseActualBuilder();
        Coach coach = new Coach();
        coach.setCourseBuilder(courseBuilder);

        Course course = coach.makeCourse("Java设计模式精讲",
                                        "Java设计模式精讲PPT",
                                "Java设计模式精讲Video",
                                        "Java设计模式精讲手记",
                                        "Java设计模式精讲问答");
        System.out.println(course);
    }
}
