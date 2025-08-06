package main.command;

public class Fan {
    private String location;
    private int speed; // 0=off, 1=low, 2=medium, 3=high
    private int prevSpeed;
    
    public Fan(String location) {
        this.location = location;
        this.speed = 0;
        this.prevSpeed = 0;
    }
    
    public void high() {
        prevSpeed = speed;
        speed = 3;
        System.out.println(location + " fan is on HIGH");
    }
    
    public void medium() {
        prevSpeed = speed;
        speed = 2;
        System.out.println(location + " fan is on MEDIUM");
    }
    
    public void low() {
        prevSpeed = speed;
        speed = 1;
        System.out.println(location + " fan is on LOW");
    }
    
    public void off() {
        prevSpeed = speed;
        speed = 0;
        System.out.println(location + " fan is OFF");
    }
    
    public int getSpeed() {
        return speed;
    }
    
    public int getPrevSpeed() {
        return prevSpeed;
    }
    
    public String getLocation() {
        return location;
    }
}