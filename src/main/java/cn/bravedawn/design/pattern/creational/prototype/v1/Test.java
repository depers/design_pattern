package cn.bravedawn.design.pattern.creational.prototype.v1;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 应用层
 * @date : Created in 2020/10/20 20:27
 */
public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        Mail mail = new Mail();
        mail.setContent("初始化模板");
        System.out.println("初始化mail: " + mail);
        for (int i = 0; i < 10; i++){
            Mail mailTemp = (Mail) mail.clone();
            mail.setName("姓名" + i);
            mail.setEmailAddress("姓名" + i + "@qq.com");
            mail.setContent("恭喜您，此次活动中奖了");
            MailUtil.sendMail(mail);
            System.out.println("克隆的mailTemp: " + mailTemp);
        }
        MailUtil.saveOriginMailRecord(mail);
    }
}
