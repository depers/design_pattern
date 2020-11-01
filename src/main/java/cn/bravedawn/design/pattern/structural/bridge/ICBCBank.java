package cn.bravedawn.design.pattern.structural.bridge;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 中国工商银行，RefinedAbstraction（扩充抽象类）
 * @date : Created in 2020/10/31 17:11
 */
public class ICBCBank extends Bank{

    public ICBCBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("打开中国工商银行账号");
        account.openAccount();
        return account;
    }
}
