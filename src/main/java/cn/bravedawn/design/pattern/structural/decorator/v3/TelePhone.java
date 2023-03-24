package cn.bravedawn.design.pattern.structural.decorator.v3;

/**
 * @author : fengx9
 * @program : design_pattern
 * @date : Created in 2023/03/22 1:46 PM
 */
public class TelePhone implements Phone{

    @Override
    public String callIn() {
        System.out.println("接受语言信息");
        return "get info";
    }

    @Override
    public Boolean callOut(String info) {
        System.out.println("发送语言信息：" + info);
        return true;
    }
}
