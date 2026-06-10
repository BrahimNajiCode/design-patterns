package behavioral.state.traffic;

import lombok.AllArgsConstructor;
import lombok.Setter;
@AllArgsConstructor
@Setter
public class TrafficLight {
    private State currentState;
    public void request(){
        currentState.handle(this);
    }
}
