package cn.bravedawn.design.pattern.behavioral.visitor;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 实战课程
 * @date : Created in 2020/12/24 20:10
 */
public class CodingCourse extends Course {

    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
