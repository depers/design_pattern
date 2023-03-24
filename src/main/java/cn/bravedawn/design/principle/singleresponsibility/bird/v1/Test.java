package cn.bravedawn.design.principle.singleresponsibility.bird.v1;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 测试类
 * @date : Created in 2020/9/5 14:26
 */
public class Test {

    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.mainMoveMode("大雁");
        /**
         * 拓展Bird类的功能
         */
        bird.mainMoveMode("鸵鸟");

        /**
         * 如果加企鹅呢，又得修改Bird了
         */

    }
}
