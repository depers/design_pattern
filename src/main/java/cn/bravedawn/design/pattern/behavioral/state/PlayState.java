package cn.bravedawn.design.pattern.behavioral.state;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 开始状态
 * @date : Created in 2020/12/28 21:26
 */
public class PlayState extends CourseVideoState{

    @Override
    public void play() {
        System.out.println("正常播放课程视频状态");
    }

    @Override
    public void speed() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.SPEED_STATE);
    }

    @Override
    public void pause() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.PAUSE_STATE);
    }

    @Override
    public void stop() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.STOP_STATE);
    }
}
