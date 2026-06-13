package behavioral.memento.bank;

import java.util.Stack;

public class AccountHistory {
    private Stack<AccountMemento> history;

    // Lazy initialization
    public AccountHistory() {
        history = new Stack<>();
    }

    public void push(AccountMemento memento){
        history.push(memento);
    }

    public AccountMemento pop(){
        return history.pop();
    }
}
