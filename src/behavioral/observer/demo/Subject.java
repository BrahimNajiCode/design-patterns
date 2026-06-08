package behavioral.observer.demo;

public interface Subject {
    // is like subscribe
    void attach(Observer observer);
    // is like unsubscribe
    void detach(Observer observer);
    // to send all the subscribers a notification.
    void notifyObservers();

}
