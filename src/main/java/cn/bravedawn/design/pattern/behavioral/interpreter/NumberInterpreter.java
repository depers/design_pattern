package cn.bravedawn.design.pattern.behavioral.interpreter;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 整型解释器
 * @date : Created in 2020/11/30 21:41
 */
public class NumberInterpreter implements Interpreter{

    private int number;

    public NumberInterpreter(String number) {
        this.number = Integer.parseInt(number);
    }

    @Override
    public int interpret() {
        return this.number;
    }
}
