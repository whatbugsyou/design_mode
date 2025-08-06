package main.state;

public class VendingMachine {
    private VendingMachineState idleState;
    private VendingMachineState hasCoinState;
    private VendingMachineState dispensingState;
    private VendingMachineState outOfStockState;
    
    private VendingMachineState currentState;
    private int stock;
    
    public VendingMachine(int stock) {
        this.stock = stock;
        
        // Initialize all states
        idleState = new IdleState(this);
        hasCoinState = new HasCoinState(this);
        dispensingState = new DispensingState(this);
        outOfStockState = new OutOfStockState(this);
        
        // Set initial state
        if (stock > 0) {
            currentState = idleState;
        } else {
            currentState = outOfStockState;
        }
    }
    
    public void insertCoin() {
        currentState.insertCoin();
    }
    
    public void selectProduct() {
        currentState.selectProduct();
    }
    
    public void dispenseProduct() {
        currentState.dispenseProduct();
    }
    
    public void returnChange() {
        currentState.returnChange();
    }
    
    public void refillStock(int amount) {
        stock += amount;
        System.out.println("Stock refilled. Current stock: " + stock);
        if (stock > 0 && currentState == outOfStockState) {
            setState(idleState);
        }
    }
    
    // State management methods
    public void setState(VendingMachineState state) {
        this.currentState = state;
    }
    
    public void decreaseStock() {
        if (stock > 0) {
            stock--;
        }
    }
    
    // Getters for states
    public VendingMachineState getIdleState() {
        return idleState;
    }
    
    public VendingMachineState getHasCoinState() {
        return hasCoinState;
    }
    
    public VendingMachineState getDispensingState() {
        return dispensingState;
    }
    
    public VendingMachineState getOutOfStockState() {
        return outOfStockState;
    }
    
    public int getStock() {
        return stock;
    }
    
    public String getCurrentStateName() {
        if (currentState == idleState) return "Idle";
        if (currentState == hasCoinState) return "Has Coin";
        if (currentState == dispensingState) return "Dispensing";
        if (currentState == outOfStockState) return "Out of Stock";
        return "Unknown";
    }
}