package behavioral.mediator.air_traffic;

public class App {
    public static void main(String[] args) {
        AirTrafficControl tower = new AirTrafficControlImpl();

        Plane p1 = new Plane(10001,"A1","2019", tower);
        Plane p2 = new Plane(10002,"B2","2015", tower);
        Plane p3 = new Plane(10003, "C3","2024" ,tower);

        p1.requestLanding();
        p2.requestLanding();
        p3.requestLanding();

        p1.leaveRunway();
        p2.leaveRunway();
        p3.leaveRunway();
    }
}
