package cn.bravedawn.design.pattern.structural.bridge;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 银行抽象类，Abstraction（抽象类）
 * @date : Created in 2020/10/31 17:08
 */
public abstract class Bank {

    protected Account account;

    public Bank(Account account) {
        this.account = account;
    }

    abstract Account openAccount();
}
