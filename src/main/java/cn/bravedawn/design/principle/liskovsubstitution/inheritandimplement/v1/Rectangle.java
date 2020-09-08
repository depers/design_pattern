package cn.bravedawn.design.principle.liskovsubstitution.inheritandimplement.v1;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 长方形
 * @date : Created in 2020/9/7 21:07
 */
public class Rectangle {

    private long length;
    private long width;

    public long getLength() {
        return length;
    }

    public void setLength(long length) {
        this.length = length;
    }

    public long getWidth() {
        return width;
    }

    public void setWidth(long width) {
        this.width = width;
    }
}
