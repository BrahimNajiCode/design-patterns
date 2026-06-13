package behavioral.mediator.air_traffic;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AirTrafficControlImpl implements AirTrafficControl {
    private Queue<Plane> waitingPlanes;
    private boolean isRunWayAvailable = true;

    public AirTrafficControlImpl(){waitingPlanes = new LinkedList<>();}



    @Override
    public void requestLanding(Plane plane) {
        if(isRunWayAvailable){
            isRunWayAvailable = false;
            System.out.println("Runway free -> Landing granted");
            plane.land();
        }else{
            System.out.println("Runway busy -> Added to waiting queue");
            waitingPlanes.add(plane);
        }
    }

    @Override
    public void notifyRunawayFree() {
        isRunWayAvailable = true;
        System.out.println("===============================");
        System.out.println("Runway free");
        System.out.println("===============================");
        if(!waitingPlanes.isEmpty())
            waitingPlanes.remove().requestLanding();
    }
}
