package cn.bravedawn.design.principle.compositionaggregation.v1;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 产品Dao
 * @date : Created in 2020/9/13 15:14
 */
public class ProductDao extends DBConnection{

    public void addProductByMySQL(){
        String conn = super.getMySQLConnection();
        System.out.println("使用" + conn + "增加产品");
    }

    public void addProductByPostgreSQL(){
        String conn = super.getPostgreSQLConnection();
        System.out.println("使用" + conn + "增加产品");
    }
}
