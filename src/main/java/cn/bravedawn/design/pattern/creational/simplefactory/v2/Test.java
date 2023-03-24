package cn.bravedawn.design.pattern.creational.simplefactory.v2;


/**
 * @author : depers
 * @program : design_pattern
 * @description: 应用层
 * @date : Created in 2020/9/13 16:03
 */
public class Test {

    public static void main(String[] args) {
        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo("Java");
        if (video == null){
            return;
        }
        video.product();

        Video vi = videoFactory.getVideo(PythonVideo.class);
        vi.product();
    }
}
