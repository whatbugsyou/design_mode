package main.visitor;

public class Computer implements ComputerPart {
    private ComputerPart[] parts;
    
    public Computer() {
        parts = new ComputerPart[] {
            new Mouse(), 
            new Keyboard(), 
            new Monitor()
        };
    }
    
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        // Visit all parts first
        for (ComputerPart part : parts) {
            part.accept(computerPartVisitor);
        }
        // Then visit itself
        computerPartVisitor.visit(this);
    }
}