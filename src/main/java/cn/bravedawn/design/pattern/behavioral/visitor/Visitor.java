package cn.bravedawn.design.pattern.behavioral.visitor;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 具体访问者
 * @date : Created in 2020/12/24 20:18
 */
public class Visitor implements IVisitor{

    // 访问免费课程，打印所有免费课程名称
    @Override
    public void visit(FreeCourse freeCourse) {
        System.out.println("免费课程：" + freeCourse.getName());
    }

    // 访问实战课程，打印所有实战课程名称和价格
    @Override
    public void visit(CodingCourse codingCourse) {
        System.out.println("实战课程：" + codingCourse.getName() + " 价格：" + codingCourse.getPrice());
    }
}
