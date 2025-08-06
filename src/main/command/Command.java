package main.command;

/**
 * Command interface for encapsulating requests
 */
public interface Command {
    void execute();
    void undo();
}