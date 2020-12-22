package cn.bravedawn.design.pattern.behavioral.chainofresponsibility;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 批准者
 * @date : Created in 2020/12/22 19:51
 */
public abstract class Approver {

    /**
     * 1.该属性是责任链模式的关键，声明一个自己
     * 2.approver这个属性不一定就是this自己，具体看如何赋值
     * 3.使用protected关键字是为了子类能访问到他
     */
    protected Approver approver;

    public void setNextApprover(Approver approver) {
        this.approver = approver;
    }

    public abstract void deploy(Course course);
}
