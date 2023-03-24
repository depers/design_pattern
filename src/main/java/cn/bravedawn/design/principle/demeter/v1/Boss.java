package cn.bravedawn.design.principle.demeter.v1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 老板
 * @date : Created in 2020/9/5 15:12
 */
public class Boss {

    /**
     * 老板想查网站目前有多少课程，向TeamLeader下指令
     * 按照迪米特法则，Boss与TeamLeader是朋友，与Course并不是Boss的朋友。
     * 目前的这种写法Course出现在了Boss的方法内部，Boss应该不需要了解Course的，所以违背了迪米特法则
     * @param teamLeader 团队负责人
     */
    public void commandCheckNumber(TeamLeader teamLeader){

        // 下面模拟数据库查询数据
        List<Course> courseList = new ArrayList<Course>();
        for (int i = 0; i < 20; i++){
            courseList.add(new Course());
        }

        // 询问团队负责人课程的数量
        teamLeader.checkNumberOfCourse(courseList);
    }

}
