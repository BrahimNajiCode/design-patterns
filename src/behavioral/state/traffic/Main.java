package behavioral.state.traffic;

public class Main {
    public static void main(String[] args) {

        TrafficLight light = new TrafficLight(new RedState());

        for (int i = 0; i < 10; ++i) {
            light.request();
        }
    }
}
