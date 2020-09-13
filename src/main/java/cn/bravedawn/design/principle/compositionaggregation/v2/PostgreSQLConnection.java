package cn.bravedawn.design.principle.compositionaggregation.v2;

/**
 * @author : depers
 * @program : design_pattern
 * @description: PostgreSQL数据库连接
 * @date : Created in 2020/9/13 15:29
 */
public class PostgreSQLConnection extends DBConnection {


    public String getConnection() {
        return "PostgreSQL数据连接";
    }
}
