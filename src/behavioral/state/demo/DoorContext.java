package behavioral.state.demo;

import lombok.Setter;

public class DoorContext {
    @Setter
    private State state;
    public void request(){
        state.handle();
    }
}
