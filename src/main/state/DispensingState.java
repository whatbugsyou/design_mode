package main.state;

public class DispensingState extends VendingMachineState {
    
    public DispensingState(VendingMachine vendingMachine) {
        super(vendingMachine);
    }
    
    @Override
    public void insertCoin() {
        System.out.println("Please wait, dispensing in progress...");
    }
    
    @Override
    public void selectProduct() {
        System.out.println("Product already selected, dispensing in progress...");
    }
    
    @Override
    public void dispenseProduct() {
        System.out.println("Product dispensed successfully!");
        vendingMachine.decreaseStock();
        
        if (vendingMachine.getStock() > 0) {
            vendingMachine.setState(vendingMachine.getIdleState());
        } else {
            System.out.println("Machine is out of stock!");
            vendingMachine.setState(vendingMachine.getOutOfStockState());
        }
    }
    
    @Override
    public void returnChange() {
        System.out.println("Cannot return change while dispensing.");
    }
}