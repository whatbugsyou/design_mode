package main.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * this demo dose not consider thread safety, and has no specific message notify but notify all.
 */
public class Observable {
    private List<Observer> observers = new ArrayList<>();
    public void addObserver(Observer o){
        observers.add(o);
    }
    public void removeObserver(Observer o){
        observers.remove(o);
    }
    public void notifyAllObservers(Object arg){
        for (Observer observer : observers) {
            observer.update(this, arg);
        }
    }

}
