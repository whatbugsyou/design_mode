package main.mediator;

public class RoleA extends Role{

    @Override
    public void sendMessage(String message) {
        mediator.relayMessage(this, message);
    }

    @Override
    protected void receiveMessage(String message) {
        System.out.println("RoleA receive :" + message);
    }
}
