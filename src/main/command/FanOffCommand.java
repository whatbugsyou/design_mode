package main.command;

public class FanOffCommand implements Command {
    private Fan fan;
    
    public FanOffCommand(Fan fan) {
        this.fan = fan;
    }
    
    @Override
    public void execute() {
        fan.off();
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