package cn.bravedawn.design.principle.openclose;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 测试类
 * @date : Created in 2020/8/23 18:27
 */
public class Test {

    public static void main(String[] args) {
        Course javaCourse = new Course(96, "Java企业级电商课程", 348d);
        System.out.println("课程id: " + javaCourse.getId() + " 课程名称: " + javaCourse.getName() + " 课程价格: " + javaCourse.getPrice());

        // 使用父类，向上强转
        Course course = new DiscountCourse(96, "Java企业级电商课程", 348d);
        DiscountCourse discountCourse = (DiscountCourse) course;
        System.out.println("课程id: " + discountCourse.getId() + " 课程名称: " + discountCourse.getName() +
                           " 课程价格: " + discountCourse.getPrice() + " 课程原价: " + discountCourse.getOriginPrice());

        // 使用接口，向上强转
        ICourse iCourse = new DiscountCourse(96, "Java企业级电商课程", 348d);
        DiscountCourse disCourse = (DiscountCourse) iCourse;
        System.out.println("课程id: " + disCourse.getId() + " 课程名称: " + disCourse.getName() +
                " 课程价格: " + disCourse.getPrice() + " 课程原价: " + disCourse.getOriginPrice());
    }
}
