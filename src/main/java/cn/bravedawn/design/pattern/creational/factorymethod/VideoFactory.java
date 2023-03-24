package cn.bravedawn.design.pattern.creational.factorymethod;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 视频工厂, 抽象工厂
 * @date : Created in 2020/9/13 16:00
 */
public abstract class VideoFactory {

    /**
     * 为什么使用抽象类：
     * 这里使用抽象类是因为有些属性或是方法是已知的，我们可以在抽象类中进行定义；
     * 如果不需要定义已知内容或是方法，全是未知的，可以采用接口实现
     */
    public abstract Video getVideo();
}
