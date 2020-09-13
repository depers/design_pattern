package cn.bravedawn.design.principle.compositionaggregation.v2;

/**
 * @author : depers
 * @program : design_pattern
 * @description: MySQL数据库连接
 * @date : Created in 2020/9/13 15:28
 */
public class MySQLConnection extends DBConnection{


    public String getConnection() {
        return "MySQL数据连接";
    }
}
