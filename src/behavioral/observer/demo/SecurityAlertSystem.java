package behavioral.observer.demo;

import java.util.ArrayList;
import java.util.List;

public class SecurityAlertSystem implements Subject{
    private List<Observer> observers = new ArrayList<>();
    private String alert;

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer o : observers){
            o.update(alert);
        }
    }

    public void detectThreat(String threat){
        this.alert = threat;
        notifyObservers();
    }
}
