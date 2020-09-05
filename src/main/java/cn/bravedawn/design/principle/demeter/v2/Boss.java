package cn.bravedawn.design.principle.demeter.v2;

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
     * 老板想查网站目前有多少课程，向TeamLeader下指令，不需要知道和接触Course
     * @param teamLeader 团队负责人
     */
    public void commandCheckNumber(TeamLeader teamLeader){
        // 询问团队负责人课程的数量
        teamLeader.checkNumberOfCourse();
    }

}
