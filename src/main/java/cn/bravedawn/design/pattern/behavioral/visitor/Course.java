package cn.bravedawn.design.pattern.behavioral.visitor;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 课程
 * @date : Created in 2020/12/24 20:11
 */
public abstract class Course {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void accept(IVisitor visitor);
}
