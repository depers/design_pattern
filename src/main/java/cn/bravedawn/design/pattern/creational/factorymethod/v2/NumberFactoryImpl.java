package cn.bravedawn.design.pattern.creational.factorymethod.v2;

import java.math.BigDecimal;

public class NumberFactoryImpl implements NumberFactory{

    /**
     * 工厂接口的实现类
     */

    @Override
    public Number parse(String s) {
        return new BigDecimal(s);
    }
}
