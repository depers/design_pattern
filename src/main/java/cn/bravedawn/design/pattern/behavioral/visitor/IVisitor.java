package cn.bravedawn.design.pattern.behavioral.visitor;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 访问者
 * @date : Created in 2020/12/24 20:12
 */
public interface IVisitor {

    void visit(FreeCourse freeCourse);

    void visit(CodingCourse codingCourse);
}
