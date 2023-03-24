package cn.bravedawn.design.pattern.creational.simplefactory.v1;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 应用层
 * @date : Created in 2020/9/13 15:56
 */
public class Test {

    /**
     * 如果不在本包内使用PythonVideo或是JavaVideo，类一定会被import进来
     * 这里我们可以采用简单工厂来解决这个问题
     */
    public static void main(String[] args) {
        Video video = new JavaVideo();
        video.product();
    }
}
