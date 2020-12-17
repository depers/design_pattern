package cn.bravedawn.design.pattern.behavioral.command;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 课程视频,接收者
 * @date : Created in 2020/12/17 21:32
 */
public class CourseVideo {

    private String name;

    public CourseVideo(String name) {
        this.name = name;
    }

    public void open(){
        System.out.println(this.name + "课程开放");
    }


    public void close(){
        System.out.println(this.name + "课程关闭");
    }
}
