package cn.bravedawn.design.principle.singleresponsibility.course.v2;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 课程实现类
 * @date : Created in 2020/9/5 14:45
 */
public class CourseImpl implements ICourseContent, ICourseManager{

    /**
     * 由实现类控制使用和实现那些功能，但是他的接口都是单一职责
     */

    public String getCourseName() {
        return null;
    }

    public byte[] getCourseVideo() {
        return new byte[0];
    }

    public void studyCourse() {

    }

    public void refundCourse() {

    }
}
