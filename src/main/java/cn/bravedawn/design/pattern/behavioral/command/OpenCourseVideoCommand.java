package cn.bravedawn.design.pattern.behavioral.command;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 打开课程命令,具体命令类
 * @date : Created in 2020/12/17 21:35
 */
public class OpenCourseVideoCommand implements Command{

    private CourseVideo courseVideo;

    public OpenCourseVideoCommand(CourseVideo courseVideo) {
        this.courseVideo = courseVideo;
    }

    @Override
    public void execute() {
        courseVideo.open();
    }
}
