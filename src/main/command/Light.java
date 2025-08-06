package main.command;

public class Light {
    private String location;
    private boolean isOn;
    
    public Light(String location) {
        this.location = location;
        this.isOn = false;
    }
    
    public void turnOn() {
        isOn = true;
        System.out.println(location + " light is ON");
    }
    
    public void turnOff() {
        isOn = false;
        System.out.println(location + " light is OFF");
    }
    
    public boolean isOn() {
        return isOn;
    }
    
    public String getLocation() {
        return location;
    }
}