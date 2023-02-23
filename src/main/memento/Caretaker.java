package main.memento;


import java.util.Date;
import java.util.HashMap;

public class Caretaker {
    private HashMap<Date,Memento> mementoMap = new HashMap<>();
    public Memento getMemento(Date date){
        return mementoMap.get(date);
    }
    public void saveMemento(Date date,Memento memento){
        mementoMap.put(date,memento);
        System.out.println("memento saved");
    }
}
