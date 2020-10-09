package main.chainOfResponsibility;

public class HandlerB extends HandlerChain{
    public HandlerB(int key) {
        super(key);
    }

    @Override
    protected void dosomething() {
        System.out.println("through HandelB ,key="+key);
    }
}
