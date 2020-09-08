package cn.bravedawn.design.principle.liskovsubstitution.inheritandimplement.v1;

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

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(10);
        rectangle.setLength(20);
        reSize(rectangle);

        /**
         * 下面的这段程序会一直执行下去；
         * 根据里氏替换原则，reSize方法中我们将父类替换为子类时，程序运行的结果应当相同，但是Square和Rectangle却不是；
         * 说明在执行reSize这个应用场景下，正方形Square是不适合作为长方形Rectangle的子类的；
         */
        Square square = new Square();
        square.setSideLength(10);
        reSize(square);
    }
}
