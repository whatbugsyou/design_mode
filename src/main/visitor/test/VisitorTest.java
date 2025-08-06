package main.visitor.test;

import main.visitor.*;

public class VisitorTest {
    public static void main(String[] args) {
        System.out.println("=== Visitor Pattern Demo - Computer Parts ===\n");
        
        ComputerPart computer = new Computer();
        
        // Test display visitor
        System.out.println("1. Using Display Visitor:");
        computer.accept(new ComputerPartDisplayVisitor());
        System.out.println();
        
        // Test price visitor
        System.out.println("2. Using Price Visitor:");
        ComputerPartPriceVisitor priceVisitor = new ComputerPartPriceVisitor();
        computer.accept(priceVisitor);
        System.out.println("Final total price: $" + priceVisitor.getTotalPrice());
        System.out.println();
        
        // Test individual parts
        System.out.println("3. Testing individual parts with display visitor:");
        ComputerPartDisplayVisitor displayVisitor = new ComputerPartDisplayVisitor();
        
        ComputerPart mouse = new Mouse();
        ComputerPart keyboard = new Keyboard();
        ComputerPart monitor = new Monitor();
        
        mouse.accept(displayVisitor);
        keyboard.accept(displayVisitor);
        monitor.accept(displayVisitor);
        System.out.println();
        
        // Test individual parts with price visitor
        System.out.println("4. Testing individual parts with price visitor:");
        ComputerPartPriceVisitor individualPriceVisitor = new ComputerPartPriceVisitor();
        
        mouse.accept(individualPriceVisitor);
        System.out.println("Current total: $" + individualPriceVisitor.getTotalPrice());
        
        keyboard.accept(individualPriceVisitor);
        System.out.println("Current total: $" + individualPriceVisitor.getTotalPrice());
        
        monitor.accept(individualPriceVisitor);
        System.out.println("Final total: $" + individualPriceVisitor.getTotalPrice());
        System.out.println();
        
        // Show visitor pattern benefits
        System.out.println("5. Demonstrating Visitor Pattern Benefits:");
        System.out.println("- Easy to add new operations (visitors) without modifying existing classes");
        System.out.println("- Centralized related operations in visitor classes");
        System.out.println("- Follows Single Responsibility Principle");
        System.out.println("- Supports operations on heterogeneous object structures");
    }
}