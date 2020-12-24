package cn.bravedawn.design.pattern.behavioral.visitor;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 免费课程
 * @date : Created in 2020/12/24 20:10
 */
public class FreeCourse extends Course{

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
