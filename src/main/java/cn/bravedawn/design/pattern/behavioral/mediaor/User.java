package cn.bravedawn.design.pattern.behavioral.mediaor;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 用户
 * @date : Created in 2020/12/21 20:36
 */
public class User {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name) {
        this.name = name;
    }

    public void sendMessage(String message) {
        StudentGroup.showMessage(this, message);
    }
}
