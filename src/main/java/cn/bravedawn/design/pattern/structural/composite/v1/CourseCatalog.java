package cn.bravedawn.design.pattern.structural.composite.v1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 课程目录
 * @date : Created in 2020/10/31 10:38
 */
public class CourseCatalog extends CatalogComponent{

    private List<CatalogComponent> items = new ArrayList<CatalogComponent>();
    private String name;

    public CourseCatalog(String name) {
        this.name = name;
    }

    @Override
    public String getName(CatalogComponent component) {
        return this.name;
    }

    @Override
    public void add(CatalogComponent component) {
        items.add(component);
    }

    @Override
    public void remove(CatalogComponent component) {
        items.remove(component);
    }

    @Override
    public void print() {
        System.out.println(this.name);
        for (CatalogComponent component : items){
            System.out.print("  ");
            component.print();
        }
    }
}
