package cn.bravedawn.design.principle.liskovsubstitution.inheritandimplement.v2;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 正方形
 * @date : Created in 2020/9/7 21:30
 */
public class Square implements Quadrangle{

    private long sideLength;

    public long getSideLength() {
        return sideLength;
    }

    public void setSideLength(long sideLength) {
        this.sideLength = sideLength;
    }

    public long getLength() {
        return sideLength;
    }

    public long getWidth() {
        return sideLength;
    }
}
