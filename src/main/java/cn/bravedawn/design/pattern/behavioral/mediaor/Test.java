package cn.bravedawn.design.pattern.behavioral.mediaor;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 应用层
 * @date : Created in 2020/12/21 20:50
 */
public class Test {

    public static void main(String[] args) {
        User geely = new User("Geely");
        User tom = new User("Tom");

        geely.sendMessage("Hey! Tom! Let's learn Design Pattern.");
        tom.sendMessage("Ok! GeelyT");
    }
}
