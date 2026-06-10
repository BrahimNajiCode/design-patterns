package behavioral.state.traffic;

public class GreenState implements State{
    @Override
    public void handle(TrafficLight context) {
        System.out.println("Green → Yellow");
        context.setCurrentState(new YellowState());
    }
}
