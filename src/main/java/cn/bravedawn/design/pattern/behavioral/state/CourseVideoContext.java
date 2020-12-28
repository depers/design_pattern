package cn.bravedawn.design.pattern.behavioral.state;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 课程上下文
 * @date : Created in 2020/12/28 21:23
 */
public class CourseVideoContext {

    private CourseVideoState courseVideoState;

    // 下面这里可以利用享元模式在多个上下文中共享状态实例
    public final static PlayState PLAY_STATE = new PlayState();
    public final static StopState STOP_STATE = new StopState();
    public final static PauseState PAUSE_STATE = new PauseState();
    public final static SpeedState SPEED_STATE = new SpeedState();

    public CourseVideoState getCourseVideoState() {
        return courseVideoState;
    }

    public void setCourseVideoState(CourseVideoState CourseVideoState) {
        this.courseVideoState = CourseVideoState;
        this.courseVideoState.setCourseVideoContext(this);
    }

    public void play(){
        this.courseVideoState.play();
    }

    public void speed(){
        this.courseVideoState.speed();
    }

    public void pause(){
        this.courseVideoState.pause();
    }

    public void stop(){
        this.courseVideoState.stop();
    }
}
