package behavioral.state.demo;

public class UnlockedState implements State{
    @Override
    public void handle() {
        System.out.println("Door is UNLOCKED 🔓");
    }
}
