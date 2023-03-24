package cn.bravedawn.design.pattern.behavioral.interpreter;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 应用层
 * @date : Created in 2020/11/30 22:03
 */
public class Test {

    public static void main(String[] args) {
        String inputStr = "6 100 11 + *";
        MyExpressionParser expressionParser = new MyExpressionParser();
        int result = expressionParser.parse(inputStr);
        System.out.println("解释器计算结果：" + result);
    }
}
