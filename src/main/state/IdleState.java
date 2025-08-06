package main.state;

public class IdleState extends VendingMachineState {
    
    public IdleState(VendingMachine vendingMachine) {
        super(vendingMachine);
    }
    
    @Override
    public void insertCoin() {
        System.out.println("Coin inserted. Machine is ready for product selection.");
        vendingMachine.setState(vendingMachine.getHasCoinState());
    }
    
    @Override
    public void selectProduct() {
        System.out.println("Please insert coin first.");
    }
    
    @Override
    public void dispenseProduct() {
        System.out.println("Please insert coin and select product first.");
    }
    
    @Override
    public void returnChange() {
        System.out.println("No coin to return.");
    }
}