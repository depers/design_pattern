package cn.bravedawn.design.pattern.creational.prototype.v1;

import java.text.MessageFormat;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 邮件工具
 * @date : Created in 2020/10/19 21:48
 */
public class MailUtil {

    public static void sendMail(Mail mail){
        String outputContent = "向{0}同学，邮件地址:{1}，邮件内容{2}发送邮件";
        System.out.println(MessageFormat.format(outputContent, mail.getName(), mail.getEmailAddress(), mail.getContent()));
    }

    public static void saveOriginMailRecord(Mail mail){
        System.out.println("存储originMail记录，originMail: " + mail.getContent());
    }
}
