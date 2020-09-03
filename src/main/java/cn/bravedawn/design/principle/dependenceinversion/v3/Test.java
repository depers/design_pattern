package cn.bravedawn.design.principle.dependenceinversion.v3;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 测试类
 * @date : Created in 2020/9/3 22:18
 */
public class Test {

    public static void main(String[] args) {

        /**
         * 面向接口编程，将每个课程作为构造函数参数传入
         * 缺点是每次都要新建类
         */
        Jack jack = new Jack(new JavaCourse());
        jack.studyCourse();

        Jack jack2 = new Jack(new FECourse());
        jack2.studyCourse();

    }
}
