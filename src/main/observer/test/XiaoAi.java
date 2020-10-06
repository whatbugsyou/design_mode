package main.observer.test;

import main.observer.Observable;
import main.observer.Observer;

public class XiaoAi extends Observer {
    @Override
    public void update(Observable observable, Object arg) {
        if ((boolean)arg){
            System.out.println("I can see you！");
        }else {
            System.out.println("where are you?");
        }
    }
}
