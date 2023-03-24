package cn.bravedawn.design.pattern.behavioral.interpreter;

import java.util.Stack;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 表达式解析
 * @date : Created in 2020/11/30 21:43
 */
public class MyExpressionParser {

    private Stack<Interpreter> stack = new Stack<Interpreter>();

    public int parse(String str){
        String[] strItemArray = str.split(" ");
        for (String symbol : strItemArray){
            if (!OperatorUtil.isOperator(symbol)){
                Interpreter numberExpression = new NumberInterpreter(symbol);
                stack.push(numberExpression);
                System.out.println(String.format("入栈：%d", numberExpression.interpret()));
            } else{
                // 是运算符号，可以计算
                Interpreter firstExpression = stack.pop();
                Interpreter secondExpression = stack.pop();
                System.out.println(String.format("出栈：%d 和 %d", firstExpression.interpret(), secondExpression.interpret()));
                Interpreter operator = OperatorUtil.getExpressionObject(firstExpression, secondExpression, symbol);
                System.out.println(String.format("应用运算符：%s", operator));
                int result = operator.interpret();
                NumberInterpreter resultExpression = new NumberInterpreter(String.valueOf(result));
                stack.push(resultExpression);
                System.out.println(String.format("阶段结果入栈：%d", resultExpression.interpret()));
            }
        }

        int result = stack.pop().interpret();
        return result;
    }


}
