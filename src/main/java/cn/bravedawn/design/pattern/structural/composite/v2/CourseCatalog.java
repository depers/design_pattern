package cn.bravedawn.design.pattern.structural.composite.v2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 课程目录，Composite（容器构件）
 * @date : Created in 2020/10/31 10:38
 */
public class CourseCatalog extends CatalogComponent {

    private List<CatalogComponent> items = new ArrayList<CatalogComponent>();
    private String name;
    private Integer level;

    public CourseCatalog(String name, Integer level) {
        this.name = name;
        this.level = level;
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
            // 这里使用this.level是因为只准对课程目录CourseCatalog做处理，或者使用instanceof做类型判断也可以
            if (this.level != null){
                for (int i = 0; i < this.level; i++){
                    System.out.print("  ");
                }
            }
            component.print();
        }
    }
}
