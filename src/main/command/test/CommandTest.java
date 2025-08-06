package main.command.test;

import main.command.*;

public class CommandTest {
    public static void main(String[] args) {
        System.out.println("=== Command Pattern Demo - Remote Control ===\n");
        
        // Create receiver objects
        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        Fan livingRoomFan = new Fan("Living Room");
        
        // Create command objects
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
        
        FanHighCommand fanHigh = new FanHighCommand(livingRoomFan);
        FanOffCommand fanOff = new FanOffCommand(livingRoomFan);
        
        // Create macro command (turn everything on)
        Command[] partyOn = { livingRoomLightOn, kitchenLightOn, fanHigh };
        Command[] partyOff = { livingRoomLightOff, kitchenLightOff, fanOff };
        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);
        
        // Create remote control (invoker)
        RemoteControl remote = new RemoteControl();
        
        // Set up commands
        remote.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remote.setCommand(1, kitchenLightOn, kitchenLightOff);
        remote.setCommand(2, fanHigh, fanOff);
        remote.setCommand(3, partyOnMacro, partyOffMacro);
        
        System.out.println(remote);
        
        // Test individual commands
        System.out.println("Testing individual commands:");
        remote.onButtonPressed(0);  // Living room light on
        remote.offButtonPressed(0); // Living room light off
        remote.onButtonPressed(1);  // Kitchen light on
        remote.onButtonPressed(2);  // Fan high
        System.out.println();
        
        // Test undo functionality
        System.out.println("Testing undo functionality:");
        remote.undoButtonPressed(); // Undo fan high
        remote.undoButtonPressed(); // Undo kitchen light on
        remote.undoButtonPressed(); // Undo living room light off
        System.out.println();
        
        // Test macro command
        System.out.println("Testing macro command (Party mode):");
        remote.onButtonPressed(3);  // Party on
        System.out.println();
        
        System.out.println("Undoing party mode:");
        remote.undoButtonPressed(); // Undo party on
        System.out.println();
        
        // Test undo when no commands
        System.out.println("Testing undo with no commands:");
        remote.undoButtonPressed();
        remote.undoButtonPressed();
        remote.undoButtonPressed();
        remote.undoButtonPressed();
        remote.undoButtonPressed(); // Should say "No command to undo"
    }
}