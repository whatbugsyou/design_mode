package main.chainOfResponsibility;

public class HandlerA extends HandlerChain{

    public HandlerA(int key) {
        super(key);
    }

    @Override
    protected void dosomething() {
        System.out.println("through HandelA ,key="+key);
    }
}
