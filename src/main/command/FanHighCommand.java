package main.command;

public class FanHighCommand implements Command {
    private Fan fan;
    
    public FanHighCommand(Fan fan) {
        this.fan = fan;
    }
    
    @Override
    public void execute() {
        fan.high();
    }
    
    @Override
    public void undo() {
        int prevSpeed = fan.getPrevSpeed();
        switch (prevSpeed) {
            case 3: fan.high(); break;
            case 2: fan.medium(); break;
            case 1: fan.low(); break;
            default: fan.off(); break;
        }
    }
}