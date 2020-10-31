package cn.bravedawn.design.pattern.structural.flyweight;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 应用层，场景就是让各个部门的经理作报告
 * @date : Created in 2020/10/31 9:39
 */
public class Test {

    private static final String departments[] = {"RD", "QA", "PM", "DB"};

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++){
            String department = departments[(int) (Math.random() * departments.length)];
            Manager manager = (Manager) EmployeeFactory.getManager(department);
            manager.report();
        }
    }
}
