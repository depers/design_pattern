package cn.bravedawn.design.pattern.behavioral.observer;

import java.util.Observable;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 课程，被观察者
 * @date : Created in 2020/12/2 21:31
 */
public class Course extends Observable {

    private String courseName;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void produceQuestion(Course course, Question question){
        System.out.println(question.getUserName() + "在" + course.getCourseName() + "提了一个问题");
        setChanged();
        notifyObservers(question);
    }

}
