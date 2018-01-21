package com.java.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class MyTopic implements Subject {

    private List<Observer> observers = new ArrayList<>();
    private String message;
    private boolean changed;
    private final Object object = new Object();

    public void postMessage(String message) {
        System.out.println("Message posted to the topic:" + message);
        this.message = message;
        changed = true;
        notifyObservers();
    }

    public boolean isChanged() {
        return changed;
    }

    public void register(Observer observer) {
        observers.add(observer);
    }

    public void unRegister(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        List<Observer> localObservers;
        synchronized (object) {
            if (!changed)
                return;

            localObservers = new ArrayList<>(observers);
        }
        for (Observer observer : localObservers) {
            observer.update();
        }
        changed = false;
    }

    public Object getUpdate(Subject subject) {
        return message;
    }
}