package cn.bravedawn.design.principle.compositionaggregation.v1;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 数据库连接
 * @date : Created in 2020/9/13 15:12
 */
public class DBConnection {

    public String getMySQLConnection(){
        return "MySQL数据连接";
    }
    public String getPostgreSQLConnection(){
        return "PostgreSQL数据连接";
    }
}
