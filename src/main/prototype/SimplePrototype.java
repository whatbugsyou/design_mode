package main.prototype;

public class SimplePrototype extends ProtypeAbs {
    SimplePrototype(){
        //the time costing progress
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}