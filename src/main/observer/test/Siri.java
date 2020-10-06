package main.observer.test;

import main.observer.Observable;
import main.observer.Observer;

public class Siri extends Observer {
    @Override
    public void update(Observable observable, Object arg) {
        if ((Boolean) arg){
            System.out.println("the light is on");
        }else {
            System.out.println("the light is off");
        }
    }
}
