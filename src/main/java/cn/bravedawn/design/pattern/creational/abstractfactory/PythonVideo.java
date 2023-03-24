package cn.bravedawn.design.pattern.creational.abstractfactory;

/**
 * @author : depers
 * @program : design_pattern
 * @description: Python课程
 * @date : Created in 2020/9/20 10:29
 */
public class PythonVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制Python课程视频");
    }
}
