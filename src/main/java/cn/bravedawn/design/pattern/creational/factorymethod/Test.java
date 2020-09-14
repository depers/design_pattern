package cn.bravedawn.design.pattern.creational.factorymethod;


/**
 * @author : depers
 * @program : design_pattern
 * @description: 应用层
 * @date : Created in 2020/9/13 16:03
 */
public class Test {

    public static void main(String[] args) {
        VideoFactory videoFactory = new JavaVideoFactory();
        VideoFactory videoFactory2 = new PythonVideoFactory();
        VideoFactory videoFactory3 = new FrontEndVideoFactory();
        Video video = videoFactory.getVideo();
        video.product();

    }
}
