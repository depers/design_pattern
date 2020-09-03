package cn.bravedawn.design.principle.dependenceinversion.v3;

import cn.bravedawn.design.principle.dependenceinversion.ICourse;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 一个人名
 * @date : Created in 2020/9/3 22:16
 */
public class Jack {

    private ICourse course;

    public Jack(ICourse course){
        this.course = course;
    }

    public void studyCourse(){
        course.studyCourse();
    }
}
