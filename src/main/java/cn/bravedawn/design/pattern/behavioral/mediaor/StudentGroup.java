package cn.bravedawn.design.pattern.behavioral.mediaor;

import java.util.Date;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 学习群
 * @date : Created in 2020/12/21 20:33
 */
public class StudentGroup {

    public static void showMessage(User user, String message){
        System.out.println(new Date().toString() + "[" + user.getName() + "] :" + message);
    }
}
