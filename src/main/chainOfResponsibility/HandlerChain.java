package main.chainOfResponsibility;

public abstract class HandlerChain {
    private HandlerChain nextHandler;
    protected int key;
    HandlerChain(int key){
        this.key=key;
    }
    public HandlerChain setNextHandler(HandlerChain nextHandler) {
        this.nextHandler = nextHandler;
        return nextHandler;
    }

    public void handle(Message message){
        if (this.key==message.getKey()){
           dosomething();
        }else {
            System.out.println("my key="+key+",do nothing");
        }
        if (nextHandler!=null){
            nextHandler.handle(message);
        }
    }
    protected abstract void dosomething();
}
