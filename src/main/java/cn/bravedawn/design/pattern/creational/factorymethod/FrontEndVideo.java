package cn.bravedawn.design.pattern.creational.factorymethod;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 前端课程视频
 * @date : Created in 2020/9/14 21:10
 */
public class FrontEndVideo extends Video{
    @Override
    public void product() {
        System.out.println("录制前端课程视频");
    }
}
