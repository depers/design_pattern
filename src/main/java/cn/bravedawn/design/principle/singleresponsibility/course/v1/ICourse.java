package cn.bravedawn.design.principle.singleresponsibility.course.v1;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 课程接口
 * @date : Created in 2020/9/5 14:39
 */
public interface ICourse {

    /**
     * 按照下面两大功能的划分，明显违背了单一职责原则
     */

    /**
     * 获取课程内容功能：
     * 1.获取课程名称
     * 2.获取课程视频流
     */
    String getCourseName();
    byte[] getCourseVideo();

    /**
     * 管理课程功能：
     * 1.学习课程
     * 2.课程退款
     */
    void studyCourse();
    void refundCourse();

}
