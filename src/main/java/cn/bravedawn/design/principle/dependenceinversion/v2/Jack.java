package cn.bravedawn.design.principle.dependenceinversion.v2;

import cn.bravedawn.design.principle.dependenceinversion.v4.ICourse;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 一个人名
 * @date : Created in 2020/9/3 22:16
 */
public class Jack {

    public void studyCourse(ICourse course){
        course.studyCourse();
    }
}
