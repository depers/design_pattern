package cn.bravedawn.design.pattern.creational.factorymethod.v2;

public interface NumberFactory {

    /**
     * 工厂接口
     */

    Number parse(String s);

    NumberFactory impl = new NumberFactoryImpl();

    static NumberFactory getFactory() {
        return impl;
    }
}
