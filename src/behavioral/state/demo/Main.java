package behavioral.state.demo;

public class Main {
    public static void main(String[] args) {
        DoorContext doorContext = new DoorContext();
        doorContext.setState(new LockedState());
        doorContext.request();

        doorContext.setState(new UnlockedState());
        doorContext.request();
    }
}
