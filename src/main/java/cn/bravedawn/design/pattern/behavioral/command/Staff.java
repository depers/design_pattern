package cn.bravedawn.design.pattern.behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 工作人员,调用者
 * @date : Created in 2020/12/17 21:39
 */
public class Staff {

    private List<Command> commandList = new ArrayList<Command>();

    public void addCommand(Command command){
        this.commandList.add(command);
    }

    public void executeCommands(){
        for (Command command : commandList){
            command.execute();
        }
        commandList.clear();
    }

}
