package cn.bravedawn.design.pattern.structural.flyweight;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 部门经理
 * @date : Created in 2020/10/29 21:53
 */
public class Manager implements Employee{

    /**
     * department和reportContent这两个属性是外部状态
     */
    private String department;
    private String reportContent;

    /**
     * title是在内部就已经声明好的，是内部状态
     */
    private String title = "部门经理";

    public Manager(String department) {
        this.department = department;
    }

    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }

    @Override
    public void report() {
        System.out.println(reportContent);
    }

}
