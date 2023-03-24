package cn.bravedawn.design.pattern.structural.proxy.db;

/**
 * @author : depers
 * @program : design_pattern
 * @description: DataSource的上下文
 * @date : Created in 2020/11/3 21:16
 */
public class DataSourceContextHolder {

    private static final ThreadLocal<String> CONTEXT_HOLDER = new ThreadLocal<String>();

    public static void setDBType(String dbType){
        CONTEXT_HOLDER.set(dbType);
    }

    public static String getDBType(){
        return CONTEXT_HOLDER.get();
    }

    public static void clearDBType(){
        CONTEXT_HOLDER.remove();
    }
}
