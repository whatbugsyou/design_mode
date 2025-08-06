package main.command;

import java.util.Stack;

public class RemoteControl {
    private Command[] onCommands;
    private Command[] offCommands;
    private Stack<Command> undoStack;
    
    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];
        undoStack = new Stack<>();
        
        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }
    
    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }
    
    public void onButtonPressed(int slot) {
        if (slot >= 0 && slot < onCommands.length) {
            onCommands[slot].execute();
            undoStack.push(onCommands[slot]);
        }
    }
    
    public void offButtonPressed(int slot) {
        if (slot >= 0 && slot < offCommands.length) {
            offCommands[slot].execute();
            undoStack.push(offCommands[slot]);
        }
    }
    
    public void undoButtonPressed() {
        if (!undoStack.isEmpty()) {
            Command lastCommand = undoStack.pop();
            lastCommand.undo();
        } else {
            System.out.println("No command to undo");
        }
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n------ Remote Control ------\n");
        for (int i = 0; i < onCommands.length; i++) {
            sb.append("[slot ").append(i).append("] ")
              .append(onCommands[i].getClass().getSimpleName())
              .append("    ")
              .append(offCommands[i].getClass().getSimpleName())
              .append("\n");
        }
        sb.append("[undo] ").append(undoStack.isEmpty() ? "No command" : 
                                    undoStack.peek().getClass().getSimpleName()).append("\n");
        return sb.toString();
    }
}