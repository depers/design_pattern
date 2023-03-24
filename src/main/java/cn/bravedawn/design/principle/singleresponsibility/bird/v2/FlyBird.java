package cn.bravedawn.design.principle.singleresponsibility.bird.v2;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 飞翔的鸟
 * @date : Created in 2020/9/5 14:32
 */
public class FlyBird {

    /**
     * 遵循单一职责原则，他的功能就是飞
     * @param birdName 鸟名
     */
    public void mainMoveMode(String birdName){
        System.out.println(birdName + " 用翅膀飞");
    }
}
