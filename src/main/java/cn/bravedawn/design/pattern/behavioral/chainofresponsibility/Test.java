package cn.bravedawn.design.pattern.behavioral.chainofresponsibility;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 应用层
 * @date : Created in 2020/12/22 20:09
 */
public class Test {

    public static void main(String[] args) {
        Approver articleApprover = new ArticleApprover();
        Approver videoApprover = new VideoApprover();

        Course course = new Course();
        course.setName("Java设计模式精讲");
        course.setArtilce("Java设计模式精讲手记");
        course.setVideo("Java设计模式精讲视频");

        articleApprover.setNextApprover(videoApprover);
        articleApprover.deploy(course);
    }
}
