package behavioral.command.demo;

import lombok.Setter;

import java.util.Stack;

public class RemoteControl {
    @Setter
    private Command command;
    private Stack<Command> history = new Stack<>();


    public void pressButton(){
        command.execute();
        history.push(command);
    }


    public void undo(){
        if(!history.isEmpty()){
            Command lastCommand = history.pop();
            lastCommand.undo();
        }
    }
}
