package cn.bravedawn.design.principle.demeter.v2;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 测试类
 * @date : Created in 2020/9/5 15:23
 */
public class Test {

    public static void main(String[] args) {
        Boss boss = new Boss();
        TeamLeader teamLeader = new TeamLeader();
        boss.commandCheckNumber(teamLeader);
    }
}
