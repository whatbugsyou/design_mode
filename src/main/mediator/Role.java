package main.mediator;

public abstract class Role {
    protected Mediator mediator;
    abstract public void sendMessage(String message);
    abstract protected void receiveMessage(String message);
    public void setMediator(Mediator mediator){
        this.mediator = mediator;
    }
}
