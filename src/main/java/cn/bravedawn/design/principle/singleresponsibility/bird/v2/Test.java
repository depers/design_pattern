package cn.bravedawn.design.principle.singleresponsibility.bird.v2;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 测试类
 * @date : Created in 2020/9/5 14:34
 */
public class Test {

    public static void main(String[] args) {
        /**
         * 让应用层去控制功能的具体使用
         */

        FlyBird flyBird = new FlyBird();
        flyBird.mainMoveMode("大雁");

        WalkBird walkBird = new WalkBird();
        walkBird.mainMoveMode("鸵鸟");
    }
}
