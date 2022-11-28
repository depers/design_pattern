package cn.bravedawn.design.pattern.creational.prototype.clone.shallow;

import java.util.Date;

/**
 * @author : depers
 * @program : design_pattern
 * @date : Created in 2022/11/28 21:37
 */
public class Test {


    /**
     * 实现 Cloneabe 接口并重写 Object 类中的 clone () 方法可以实现浅克隆
     */

    public static void main(String[] args) throws CloneNotSupportedException {
        Date birthday = new Date(0L);
        Pig pig1 = new Pig("佩奇", birthday);
        Pig pig2 = (Pig) pig1.clone();

        System.out.println(pig1);
        System.out.println(pig2);
        // 重置生日
        pig1.getBirthday().setTime(666666666666L);

        System.out.println(pig1);
        System.out.println(pig2);
    }
}
