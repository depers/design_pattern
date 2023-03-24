package cn.bravedawn.design.principle.liskovsubstitution.inheritandimplement.v2;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 测试类
 * @date : Created in 2020/9/7 21:12
 */
public class Test {

    /**
     * 重置长方形的宽度，使之比长度长1
     * @param rectangle
     */
    public static void reSize(Rectangle rectangle){
        while (rectangle.getWidth() <= rectangle.getLength()){
            rectangle.setWidth(rectangle.getWidth() + 1);
            System.out.println("Width: " + rectangle.getWidth() + " length: " + rectangle.getLength());
        }
        System.out.println("reSize method over, Width: " + rectangle.getWidth() + " length: " + rectangle.getLength());
    }

    /**
     * 如参使用Quadrangle的约束效果一
     * 程序会报错，因为Quadrangle并没有声明setWidth方法
     * @param quadrangle
     */
    /*
    public static void reSize(Quadrangle quadrangle){
        while (quadrangle.getWidth() <= quadrangle.getLength()){
            rectangle.setWidth(quadrangle.getWidth() + 1);
            System.out.println("Width: " + quadrangle.getWidth() + " length: " + quadrangle.getLength());
        }
        System.out.println("reSize method over, Width: " + quadrangle.getWidth() + " length: " + quadrangle.getLength());
    }
     */

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(10);
        rectangle.setLength(20);
        reSize(rectangle);

        /**
         * 如参使用Quadrangle的约束效果二
         * Square与Rectangle不是继承关系，不能使用reSize方法，从而限制square使用reSize导致的错误
         */
        /*
        Square square = new Square();
        square.setSideLength(10);
        reSize(square);
         */
    }
}
