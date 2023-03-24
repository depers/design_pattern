package cn.bravedawn.design.pattern.structural.decorator.v3;

/**
 * @author : fengx9
 * @program : design_pattern
 * @date : Created in 2023/03/22 1:48 PM
 */
public class PhoneRecordDecorator implements Phone{

    private Phone decoratedPhone;

    public PhoneRecordDecorator(Phone decoratedPhone) {
        this.decoratedPhone = decoratedPhone;
    }

    @Override
    public String callIn() {
        System.out.println("启动录音");
        String info = decoratedPhone.callIn();
        System.out.println("结束录音，并保存录音文件");
        return null;
    }

    @Override
    public Boolean callOut(String info) {
        System.out.println("启动录音");
        Boolean result = decoratedPhone.callOut(info);
        System.out.println("结束录音，并保存录音文件");
        return result;
    }
}
