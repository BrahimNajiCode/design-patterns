package behavioral.memento.demo;

import java.util.Stack;

public class History {

    private Stack<TextMemento> history;


    public History() {
        history = new Stack<>();
    }

    public void push(TextMemento memento){
        history.push(memento);
    }

    public TextMemento pop(){
        return history.pop();
    }
}
