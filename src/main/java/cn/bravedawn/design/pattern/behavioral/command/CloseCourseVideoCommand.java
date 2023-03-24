package cn.bravedawn.design.pattern.behavioral.command;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 关闭课程命令,具体命令类
 * @date : Created in 2020/12/17 21:35
 */
public class CloseCourseVideoCommand implements Command{

    private CourseVideo courseVideo;

    public CloseCourseVideoCommand(CourseVideo courseVideo) {
        this.courseVideo = courseVideo;
    }

    @Override
    public void execute() {
        courseVideo.close();
    }
}
