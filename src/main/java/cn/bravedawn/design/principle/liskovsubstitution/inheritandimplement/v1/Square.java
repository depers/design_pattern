package cn.bravedawn.design.principle.liskovsubstitution.inheritandimplement.v1;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 正方形
 * @date : Created in 2020/9/7 21:08
 */
public class Square extends Rectangle{

    private long sideLength;

    public long getSideLength() {
        return sideLength;
    }

    public void setSideLength(long sideLength) {
        this.sideLength = sideLength;
    }

    /**
     * 复写父类的方法
     */

    @Override
    public long getLength() {
        return sideLength;
    }

    @Override
    public void setLength(long length) {
        setSideLength(length);
    }

    @Override
    public long getWidth() {
        return sideLength;
    }

    @Override
    public void setWidth(long width) {
        setSideLength(width);
    }
}
