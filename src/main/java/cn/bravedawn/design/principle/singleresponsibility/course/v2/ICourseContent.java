package cn.bravedawn.design.principle.singleresponsibility.course.v2;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 课程内容接口
 * @date : Created in 2020/9/5 14:44
 */
public interface ICourseContent {

    /**
     * 获取课程内容功能：
     * 1.获取课程名称
     * 2.获取课程视频流
     */
    String getCourseName();
    byte[] getCourseVideo();
}
