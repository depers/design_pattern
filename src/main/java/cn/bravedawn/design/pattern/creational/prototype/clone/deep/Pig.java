package cn.bravedawn.design.pattern.creational.prototype.clone.deep;

import java.util.Date;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 小猪佩奇
 * @date : Created in 2020/10/20 21:36
 */
public class Pig implements Cloneable{

    private String name;
    private Date birthday;

    public Pig(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Pig pig = (Pig) super.clone();

        // 深克隆
        pig.birthday = (Date) pig.getBirthday().clone();
        return pig;
    }

    @Override
    public String toString() {
        return "Pig{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                '}' + super.toString();
    }
}
