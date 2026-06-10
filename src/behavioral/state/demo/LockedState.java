package behavioral.state.demo;

public class LockedState implements State{
    @Override
    public void handle() {
        System.out.println("Door is LOCKED 🔒");
    }
}
