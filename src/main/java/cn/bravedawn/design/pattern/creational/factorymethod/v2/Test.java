package cn.bravedawn.design.pattern.creational.factorymethod.v2;

public class Test {

    /**
     * 在这个工厂方法模式的演示demo中
     * 抽象工厂类是：NumberFactory
     * 工厂实现类是：NumberFactoryImpl
     * 抽象产品类是：Number
     * 具体产品类是：BigDecimal
     */


    public static void main(String[] args) {
        NumberFactory factory = NumberFactory.getFactory();
        Number result = factory.parse("123.56");
    }
}
