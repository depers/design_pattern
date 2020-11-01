package cn.bravedawn.design.pattern.structural.bridge;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 账号接口，Implementor（实现类接口）
 * @date : Created in 2020/10/31 16:59
 */
public interface Account {

    /**
     * 打开账号
     */
    Account openAccount();

    /**
     * 查看账号类型
     */
    void showAccountType();
}
