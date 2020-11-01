package cn.bravedawn.design.pattern.structural.composite.v1;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 目录抽象组件，Component（抽象构件）
 * @date : Created in 2020/10/31 10:28
 */
public abstract class CatalogComponent {

    public void add(CatalogComponent component){
        throw new UnsupportedOperationException("不支持添加操作");
    }

    public void remove(CatalogComponent component){
        throw new UnsupportedOperationException("不支持移除操作");
    }

    public String getName(CatalogComponent component){
        throw new UnsupportedOperationException("不支持获取名称操作");
    }

    public double getPrice(CatalogComponent component){
        throw new UnsupportedOperationException("不支持获取价格操作");
    }

    public void print(){
        throw new UnsupportedOperationException("不支持打印操作");
    }
}
