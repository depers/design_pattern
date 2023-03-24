package cn.bravedawn.design.pattern.behavioral.chainofresponsibility;

import org.apache.commons.lang3.StringUtils;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 视频批准者
 * @date : Created in 2020/12/22 20:00
 */
public class VideoApprover extends Approver{
    @Override
    public void deploy(Course course) {
        if (StringUtils.isNotEmpty(course.getVideo())) {
            System.out.println(course.getName() + "含有视频，批准");
            // 这里是重点，要做判空操作
            if (approver != null){
                approver.deploy(course);
            }
        } else{
            System.out.println(course.getName() + "不含有视频，不批准，流程结束");
            return;
        }
    }
}
