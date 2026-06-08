package behavioral.observer.e_commerce;

import java.util.ArrayList;
import java.util.List;

public class OrderSystem implements Subject{
    List<Observer> observers = new ArrayList<>();
    private String orderId;


    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyAllObservers() {
        for (Observer o : observers){
            o.update(orderId);
        }
    }

    public void placeOrder(String orderId){
        this.orderId = orderId;
        notifyAllObservers();
    }
}
