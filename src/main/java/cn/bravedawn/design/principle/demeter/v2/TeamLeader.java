package cn.bravedawn.design.principle.demeter.v2;

import java.util.ArrayList;
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
     */
    public void checkNumberOfCourse(){
        // 下面模拟数据库查询数据
        List<Course> courseList = new ArrayList<Course>();
        for (int i = 0; i < 20; i++){
            courseList.add(new Course());
        }
        System.out.println("在线课程数量是：" + courseList.size());
    }
}
