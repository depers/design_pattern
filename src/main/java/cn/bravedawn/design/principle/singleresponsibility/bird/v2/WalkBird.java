package cn.bravedawn.design.principle.singleresponsibility.bird.v2;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 走路的鸟
 * @date : Created in 2020/9/5 14:32
 */
public class WalkBird {

    /**
     * 遵循单一职责原则，他的功能就是走
     * @param birdName 鸟名
     */
    public void mainMoveMode(String birdName){
        System.out.println(birdName + " 用脚走");
    }
}
