package cn.bravedawn.design.principle.singleresponsibility.course.v2;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 课程管理接口
 * @date : Created in 2020/9/5 14:44
 */
public interface ICourseManager {

    /**
     * 管理课程功能：
     * 1.学习课程
     * 2.课程退款
     */
    void studyCourse();
    void refundCourse();
}
