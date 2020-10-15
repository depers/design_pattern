package cn.bravedawn.design.pattern.creational.singleton.enumsingleton;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 枚举实例
 * @date : Created in 2020/10/15 20:34
 */
public enum EnumInstance {

    INSTANCE;

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumInstance getInstance(){
        return INSTANCE;
    }
}
