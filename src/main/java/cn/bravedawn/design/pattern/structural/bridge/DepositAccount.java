package cn.bravedawn.design.pattern.structural.bridge;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 定期账号，ConcreteImplementor（具体实现类）
 * @date : Created in 2020/10/31 17:04
 */
public class DepositAccount implements Account{
    @Override
    public Account openAccount() {
        System.out.println("打开定期账号");
        return new DepositAccount();
    }

    @Override
    public void showAccountType() {
        System.out.println("这是一个定期账号");
    }
}
