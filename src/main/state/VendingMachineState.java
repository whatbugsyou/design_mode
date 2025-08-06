package main.state;

/**
 * Abstract state class for Vending Machine
 */
public abstract class VendingMachineState {
    protected VendingMachine vendingMachine;
    
    public VendingMachineState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }
    
    public abstract void insertCoin();
    public abstract void selectProduct();
    public abstract void dispenseProduct();
    public abstract void returnChange();
}