package main.state;

public class OutOfStockState extends VendingMachineState {
    
    public OutOfStockState(VendingMachine vendingMachine) {
        super(vendingMachine);
    }
    
    @Override
    public void insertCoin() {
        System.out.println("Machine is out of stock. Returning coin...");
    }
    
    @Override
    public void selectProduct() {
        System.out.println("Machine is out of stock. No products available.");
    }
    
    @Override
    public void dispenseProduct() {
        System.out.println("Machine is out of stock. Cannot dispense product.");
    }
    
    @Override
    public void returnChange() {
        System.out.println("No coin to return.");
    }
}