package cn.bravedawn.design.principle.compositionaggregation.v2;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 产品Dao
 * @date : Created in 2020/9/13 15:30
 */
public class ProductDao {

    private DBConnection dbConnection;

    /**
     * 使用set方法将DBConnection注入，也可以使用构造器注入
     */
    public void setDbConnection(DBConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public void addProduct(){
        String conn = dbConnection.getConnection();
        System.out.println("使用" + conn + "增加产品");
    }
}
