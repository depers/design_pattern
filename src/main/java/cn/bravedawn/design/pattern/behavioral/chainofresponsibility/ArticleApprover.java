package cn.bravedawn.design.pattern.behavioral.chainofresponsibility;

import org.apache.commons.lang3.StringUtils;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 手机批准者
 * @date : Created in 2020/12/22 19:55
 */
public class ArticleApprover extends Approver {

    @Override
    public void deploy(Course course) {
        if (StringUtils.isNotEmpty(course.getArtilce())) {
            System.out.println(course.getName() + "含有手记，批准");
            // 这里是重点，要做判空操作
            if (approver != null){
                approver.deploy(course);
            }
        } else{
            System.out.println(course.getName() + "不含有手记，不批准，流程结束");
            return;
        }
    }
}
