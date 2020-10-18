package cn.bravedawn.design.pattern.creational.singleton.enumsingleton;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 枚举实例
 * @date : Created in 2020/10/15 20:34
 */
public enum EnumInstance {

    INSTANCE{
        protected void print(){
            System.out.println("instance print test.");
        }

        public void print2(){
            System.out.println("instance print test2.");
        }
    };

    protected abstract void print();

    public abstract void print2();


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
