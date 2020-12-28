package cn.bravedawn.design.pattern.behavioral.state;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 应用层
 * @date : Created in 2020/12/28 21:53
 */
public class Test {

    public static void main(String[] args) {
        CourseVideoContext courseVideoContext = new CourseVideoContext();
        // 打开视频后自动播放
        courseVideoContext.setCourseVideoState(new PlayState());
        System.out.println("当前状态：" + courseVideoContext.getCourseVideoState().getClass().getSimpleName());

        // 暂停视频
        courseVideoContext.pause();
        System.out.println("当前状态：" + courseVideoContext.getCourseVideoState().getClass().getSimpleName());

        // 快进视频
        courseVideoContext.speed();
        System.out.println("当前状态：" + courseVideoContext.getCourseVideoState().getClass().getSimpleName());

        // 停止视频
        courseVideoContext.stop();
        System.out.println("当前状态：" + courseVideoContext.getCourseVideoState().getClass().getSimpleName());

        // 快进视频
        courseVideoContext.speed();
        System.out.println("当前状态：" + courseVideoContext.getCourseVideoState().getClass().getSimpleName());
    }
}
