package cn.bravedawn.design.pattern.creational.factorymethod;


/**
 * @author : depers
 * @program : design_pattern
 * @description: 应用层
 * @date : Created in 2020/9/13 16:03
 */
public class Test {

    /**
     * 在这个工厂方法(工厂模式)模式的演示demo中
     * 抽象工厂类是：VideoFactory
     * 工厂实现类是：FrontEndVideoFactory, JavaVideoFactory, PythonVideoFactory
     * 抽象产品类是：Video
     * 具体产品类是：FrontEndVideo, JavaVideo, PythonVideo
     */

    public static void main(String[] args) {
        VideoFactory videoFactory = new JavaVideoFactory();
        VideoFactory videoFactory2 = new PythonVideoFactory();
        VideoFactory videoFactory3 = new FrontEndVideoFactory();
        Video video = videoFactory.getVideo();
        video.product();

    }
}
