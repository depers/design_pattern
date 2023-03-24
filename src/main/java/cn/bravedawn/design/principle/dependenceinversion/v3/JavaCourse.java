package cn.bravedawn.design.principle.dependenceinversion.v3;


import cn.bravedawn.design.principle.dependenceinversion.v4.ICourse;

/**
 * @author : depers
 * @program : design_pattern
 * @description: Java课程类
 * @date : Created in 2020/9/3 22:29
 */
public class JavaCourse implements ICourse {


    public void studyCourse() {
        System.out.println("Jack在学习Java课程");
    }
}
