package cn.bravedawn.design.principle.dependenceinversion.v2;

import cn.bravedawn.design.principle.dependenceinversion.v2.Jack;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 测试类
 * @date : Created in 2020/9/3 22:18
 */
public class Test {

    public static void main(String[] args) {

        /**
         * 面向接口编程，将实现类作为参数传入
         */
        Jack jack = new Jack();
        jack.studyCourse(new JavaCourse());
        jack.studyCourse(new FECourse());

    }
}
