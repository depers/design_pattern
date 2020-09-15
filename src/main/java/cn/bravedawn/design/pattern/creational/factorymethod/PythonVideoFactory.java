package cn.bravedawn.design.pattern.creational.factorymethod;

/**
 * @author : depers
 * @program : design_pattern
 * @description: Python视频工厂，具体工厂
 * @date : Created in 2020/9/14 21:05
 */
public class PythonVideoFactory extends VideoFactory{

    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}
