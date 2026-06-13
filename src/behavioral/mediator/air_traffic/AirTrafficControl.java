package behavioral.mediator.air_traffic;

public interface AirTrafficControl {
    void requestLanding(Plane plane);
    void notifyRunawayFree();
}
