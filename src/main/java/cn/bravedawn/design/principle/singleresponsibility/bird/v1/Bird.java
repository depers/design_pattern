package cn.bravedawn.design.principle.singleresponsibility.bird.v1;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 鸟
 * @date : Created in 2020/9/5 14:24
 */
public class Bird {

    public void mainMoveMode(String birdName){
        if ("鸵鸟".equals(birdName)){
            System.out.println(birdName + " 用脚走");
        } else{
            System.out.println(birdName + " 用翅膀飞");
        }
    }
}
