package ir.hadi.observer;

public interface Subject {

    void register(Observer observer);
    void unRegister(Observer observer);

    void notifyObservers();
    Object getUpdate(Subject subject);
} 