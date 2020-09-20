package cn.bravedawn.design.pattern.creational.abstractfactory;

/**
 * @author : depers
 * @program : design_pattern
 * @description: Java视频
 * @date : Created in 2020/9/20 10:25
 */
public class JavaVideo extends Video{

    @Override
    public void produce() {
        System.out.println("录制Java课程视频");
    }
}
