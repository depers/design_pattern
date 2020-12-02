package cn.bravedawn.design.pattern.behavioral.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 讲师，观察者
 * @date : Created in 2020/12/2 21:34
 */
public class Teacher implements Observer {

    private String teacherName;

    public Teacher(String teacherName) {
        this.teacherName = teacherName;
    }

    @Override
    public void update(Observable o, Object arg) {
        Course course = (Course) o;
        Question question = (Question) arg;
        System.out.println(teacherName + "老师的" + course.getCourseName() +
                            "课程接收到一个" + question.getUserName() +
                            "提交的问题：" + question.getQuestionContent());
    }
}
