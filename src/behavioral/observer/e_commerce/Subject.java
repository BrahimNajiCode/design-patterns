package behavioral.observer.e_commerce;

public interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyAllObservers();
}
