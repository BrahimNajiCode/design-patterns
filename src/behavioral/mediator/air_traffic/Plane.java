package behavioral.mediator.air_traffic;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Plane {
    private Integer serialNumber;

    private String name;

    private String prodYear;

    private AirTrafficControl airTrafficControl;

    // You can add other attributes here...

    public void requestLanding() {
        System.out.println("Plane "+name+" requests landing");
        airTrafficControl.requestLanding(this);
    }

    public void land() {
        System.out.println("Plane "+name+": is landing ... ");
    }

    public void leaveRunway() {
        System.out.println("Plane "+name+" left runway.");
        airTrafficControl.notifyRunawayFree();
    }

}
