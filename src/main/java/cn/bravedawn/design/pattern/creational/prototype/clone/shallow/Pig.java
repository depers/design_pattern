package cn.bravedawn.design.pattern.creational.prototype.clone.shallow;

import java.util.Date;

/**
 * @author : depers
 * @program : design_pattern
 * @date : Created in 2022/11/28 21:37
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

    /**
     * 重写clone方法
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Pig{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                '}' + super.toString();
    }
}
