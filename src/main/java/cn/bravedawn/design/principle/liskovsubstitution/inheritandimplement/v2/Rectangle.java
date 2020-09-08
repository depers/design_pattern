package cn.bravedawn.design.principle.liskovsubstitution.inheritandimplement.v2;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 长方形
 * @date : Created in 2020/9/7 21:27
 */
public class Rectangle implements Quadrangle{

    private long width;
    private long length;

    public void setWidth(long width) {
        this.width = width;
    }

    public void setLength(long length) {
        this.length = length;
    }

    /**
     * 下面的方法实现Quadrangle接口
     */

    public long getLength() {
        return length;
    }

    public long getWidth() {
        return width;
    }
}
