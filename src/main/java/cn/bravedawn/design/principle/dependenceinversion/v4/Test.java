package cn.bravedawn.design.principle.dependenceinversion.v4;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 测试类
 * @date : Created in 2020/9/3 22:18
 */
public class Test {

    public static void main(String[] args) {

        /**
         * 面向接口编程，修改v3的缺点，将课程作为参数并提供set方法
         * v2和v4比较推荐
         */
        Jack jack = new Jack();
        jack.setCourse(new JavaCourse());
        jack.studyCourse();

        jack.setCourse(new FECourse());
        jack.studyCourse();

    }
}
