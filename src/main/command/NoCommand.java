package main.command;

/**
 * Null Object pattern implementation for Command
 */
public class NoCommand implements Command {
    @Override
    public void execute() {
        // Do nothing
    }
    
    @Override
    public void undo() {
        // Do nothing
    }
}