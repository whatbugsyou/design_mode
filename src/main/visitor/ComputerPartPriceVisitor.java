package main.visitor;

public class ComputerPartPriceVisitor implements ComputerPartVisitor {
    private double totalPrice = 0.0;
    
    @Override
    public void visit(Computer computer) {
        System.out.println("Computing total computer price: $" + totalPrice);
    }
    
    @Override
    public void visit(Mouse mouse) {
        double mousePrice = 25.99;
        totalPrice += mousePrice;
        System.out.println("Mouse price: $" + mousePrice);
    }
    
    @Override
    public void visit(Keyboard keyboard) {
        double keyboardPrice = 89.99;
        totalPrice += keyboardPrice;
        System.out.println("Keyboard price: $" + keyboardPrice);
    }
    
    @Override
    public void visit(Monitor monitor) {
        double monitorPrice = 299.99;
        totalPrice += monitorPrice;
        System.out.println("Monitor price: $" + monitorPrice);
    }
    
    public double getTotalPrice() {
        return totalPrice;
    }
    
    public void reset() {
        totalPrice = 0.0;
    }
}