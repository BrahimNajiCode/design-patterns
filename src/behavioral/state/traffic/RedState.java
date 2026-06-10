package behavioral.state.traffic;

public class RedState implements State{
    @Override
    public void handle(TrafficLight context) {
        System.out.println("Red → Green");
        context.setCurrentState(new GreenState());
    }
}
