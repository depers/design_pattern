package cn.bravedawn.design.principle.compositionaggregation.v2;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 测试类
 * @date : Created in 2020/9/13 15:31
 */
public class Test {

    /**
     * ProductDao使用组合复用原则将dbConnection注入
     * 该实现遵从了开闭原则和里式替换原则
     */
    public static void main(String[] args) {
        ProductDao productDao = new ProductDao();

        productDao.setDbConnection(new MySQLConnection());
        productDao.addProduct();

        productDao.setDbConnection(new PostgreSQLConnection());
        productDao.addProduct();
    }
}
