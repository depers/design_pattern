package cn.bravedawn.design.pattern.behavioral.observer;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 应用层
 * @date : Created in 2020/12/2 21:42
 */
public class Test {

    public static void main(String[] args) {
        Course course = new Course("Java设计模式精讲");
        Teacher teacher = new Teacher("Alpha");

        course.addObserver(teacher);

        // 业务逻辑代码
        Question question = new Question();
        question.setUserName("depers");
        question.setQuestionContent("Java的主函数如何编写");

        course.produceQuestion(course, question);
    }
}
