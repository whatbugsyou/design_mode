package main.observer.test;

import main.observer.Observable;

public class Light extends Observable {
    private boolean status ;
    public Light(){
        status = true;
    }
    public void setStatus(boolean status) {
        this.status = status;
        notifyAllObservers(status);
    }
}
