package cn.bravedawn.design.principle.demeter.v1;

import java.util.List;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 团队负责人
 * @date : Created in 2020/9/5 15:12
 */
public class TeamLeader {

    /**
     * 查询课程的数量
     * @param courseList 课程列表
     */
    public void checkNumberOfCourse(List<Course> courseList){
        System.out.println("在线课程数量是：" + courseList.size());
    }
}
