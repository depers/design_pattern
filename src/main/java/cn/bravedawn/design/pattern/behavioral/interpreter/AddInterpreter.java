package cn.bravedawn.design.pattern.behavioral.interpreter;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 加法解释器
 * @date : Created in 2020/11/30 21:33
 */
public class AddInterpreter implements Interpreter{

    private Interpreter firstExpression, secondExpression;

    public AddInterpreter(Interpreter firstExpression, Interpreter secondExpression){
        this.firstExpression = firstExpression;
        this.secondExpression = secondExpression;
    }


    @Override
    public int interpret() {
        return this.firstExpression.interpret() + this.secondExpression.interpret();
    }

    @Override
    public String toString() {
        return "+";
    }
}
