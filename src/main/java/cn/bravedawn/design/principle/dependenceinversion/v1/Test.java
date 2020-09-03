package cn.bravedawn.design.principle.dependenceinversion.v1;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 测试类
 * @date : Created in 2020/9/3 22:18
 */
public class Test {

    public static void main(String[] args) {

        /**
         * 每次学习新的课程都要修改jack类
         * Test类就是高层模块，而Jack就是低层模块，每次都要修改低层模块，高层过度依赖低层
         */
        Jack jack = new Jack();
        jack.studyJavaCourse();
        jack.studyFECourse();
    }
}
