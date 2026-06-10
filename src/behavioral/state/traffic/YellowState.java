package behavioral.state.traffic;

public class YellowState implements State{
    @Override
    public void handle(TrafficLight context) {
        System.out.println("Yellow → Red");
        context.setCurrentState(new RedState());
    }
}
