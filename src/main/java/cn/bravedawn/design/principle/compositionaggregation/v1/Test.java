package cn.bravedawn.design.principle.compositionaggregation.v1;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 测试类
 * @date : Created in 2020/9/13 15:22
 */
public class Test {

    public static void main(String[] args) {

        ProductDao productDao = new ProductDao();
        productDao.addProductByMySQL();

        /**
         * 如果我们的项目是多数据源的时候，要加入PostgreSQL这个时候怎么办？
         * 按照V1版本的做法，我们必须修改DBConnection和ProductDao，这样就违背了开闭原则，对拓展开发，修改关闭
         */

    }
}
