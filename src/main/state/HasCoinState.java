package main.state;

public class HasCoinState extends VendingMachineState {
    
    public HasCoinState(VendingMachine vendingMachine) {
        super(vendingMachine);
    }
    
    @Override
    public void insertCoin() {
        System.out.println("Coin already inserted. Please select a product.");
    }
    
    @Override
    public void selectProduct() {
        System.out.println("Product selected. Dispensing...");
        vendingMachine.setState(vendingMachine.getDispensingState());
    }
    
    @Override
    public void dispenseProduct() {
        System.out.println("Please select a product first.");
    }
    
    @Override
    public void returnChange() {
        System.out.println("Returning coin...");
        vendingMachine.setState(vendingMachine.getIdleState());
    }
}