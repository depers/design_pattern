package cn.bravedawn.design.pattern.behavioral.interpreter;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 工具类
 * @date : Created in 2020/11/30 21:46
 */
public class OperatorUtil {

    /**
     * 判断是否为操作符
     * @param symbol 操作符
     * @return
     */
    public static boolean isOperator(String symbol){
        return (symbol.equals("+") || symbol.equals("*"));
    }


    /**
     * 获取对应的解释器
     * @param firstInterpreter
     * @param secondInterpreter
     * @param symbol
     * @return
     */
    public static Interpreter getExpressionObject(Interpreter firstInterpreter, Interpreter secondInterpreter, String symbol){
        if (symbol.equals("+")){
            return new AddInterpreter(firstInterpreter, secondInterpreter);
        } else if(symbol.equals("*")){
            return new MultiInterpreter(firstInterpreter, secondInterpreter);
        }
        return null;
    }
}
