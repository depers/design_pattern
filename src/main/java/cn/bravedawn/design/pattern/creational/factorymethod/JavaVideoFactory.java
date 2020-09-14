package cn.bravedawn.design.pattern.creational.factorymethod;

/**
 * @author : depers
 * @program : design_pattern
 * @description: Java视频工厂
 * @date : Created in 2020/9/14 21:04
 */
public class JavaVideoFactory extends VideoFactory{

    @Override
    public Video getVideo() {
        return new JavaVideo();
    }
}
