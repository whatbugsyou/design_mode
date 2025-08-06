package main.state.test;

import main.state.VendingMachine;

public class StateTest {
    public static void main(String[] args) {
        System.out.println("=== State Pattern Demo - Vending Machine ===\n");
        
        // Create vending machine with 2 items in stock
        VendingMachine machine = new VendingMachine(2);
        
        System.out.println("Initial state: " + machine.getCurrentStateName());
        System.out.println("Stock: " + machine.getStock() + "\n");
        
        // Test normal workflow
        System.out.println("1. Normal purchase workflow:");
        machine.insertCoin();
        machine.selectProduct();
        machine.dispenseProduct();
        System.out.println("Current state: " + machine.getCurrentStateName());
        System.out.println("Stock: " + machine.getStock() + "\n");
        
        // Test another purchase to go out of stock
        System.out.println("2. Second purchase (should go out of stock):");
        machine.insertCoin();
        machine.selectProduct();
        machine.dispenseProduct();
        System.out.println("Current state: " + machine.getCurrentStateName());
        System.out.println("Stock: " + machine.getStock() + "\n");
        
        // Test operations when out of stock
        System.out.println("3. Trying operations when out of stock:");
        machine.insertCoin();
        machine.selectProduct();
        machine.dispenseProduct();
        System.out.println();
        
        // Refill stock
        System.out.println("4. Refilling stock:");
        machine.refillStock(3);
        System.out.println("Current state: " + machine.getCurrentStateName());
        System.out.println();
        
        // Test returning change
        System.out.println("5. Testing return change:");
        machine.insertCoin();
        machine.returnChange();
        System.out.println("Current state: " + machine.getCurrentStateName());
        System.out.println();
        
        // Test invalid operations
        System.out.println("6. Testing invalid operations:");
        machine.selectProduct(); // without coin
        machine.dispenseProduct(); // without coin and selection
        machine.returnChange(); // no coin to return
    }
}