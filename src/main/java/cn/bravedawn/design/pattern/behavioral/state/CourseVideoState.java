package cn.bravedawn.design.pattern.behavioral.state;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 课程状态
 * @date : Created in 2020/12/28 21:22
 */
public abstract class CourseVideoState {

    protected CourseVideoContext courseVideoContext;

    public void setCourseVideoContext(CourseVideoContext courseVideoContext) {
        this.courseVideoContext = courseVideoContext;
    }

    /**
     * 开始
     */
    public abstract void play();

    /**
     * 快进
     */
    public abstract void speed();

    /**
     * 暂停
     */
    public abstract void pause();

    /**
     * 停止
     */
    public abstract void stop();
}
