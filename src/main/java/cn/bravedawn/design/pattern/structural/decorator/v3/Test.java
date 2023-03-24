package cn.bravedawn.design.pattern.structural.decorator.v3;

/**
 * @author : fengx9
 * @program : design_pattern
 * @date : Created in 2023/03/22 1:53 PM
 */
public class Test {


    public static void main(String[] args) {
        System.out.println("原有phone无录音功能");
        Phone phone = new TelePhone();
        phone.callOut("hello, this is yee");

        System.out.println("__________________________");

        System.out.println("经过装饰后的phone有了录音功能");
        Phone phone2 = new PhoneRecordDecorator(phone);
        phone2.callOut("hello, this is yee");
    }
}
