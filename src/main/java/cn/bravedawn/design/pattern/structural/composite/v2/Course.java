package cn.bravedawn.design.pattern.structural.composite.v2;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 课程，Leaf（叶子构件）
 * @date : Created in 2020/10/31 10:34
 */
public class Course extends CatalogComponent {

    private String name;
    private double price;

    public Course(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName(CatalogComponent component) {
        return this.name;
    }

    @Override
    public double getPrice(CatalogComponent component) {
        return this.price;
    }

    @Override
    public void print() {
        System.out.println("Course Name: " + name + "Price" + price);
    }
}
