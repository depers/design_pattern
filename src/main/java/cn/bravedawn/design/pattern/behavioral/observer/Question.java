package cn.bravedawn.design.pattern.behavioral.observer;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 问题
 * @date : Created in 2020/12/2 21:33
 */
public class Question {

    private String userName;

    private String questionContent;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getQuestionContent() {
        return questionContent;
    }

    public void setQuestionContent(String questionContent) {
        this.questionContent = questionContent;
    }
}
