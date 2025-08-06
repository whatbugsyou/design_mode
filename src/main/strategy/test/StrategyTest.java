package main.strategy.test;

import main.strategy.*;

public class StrategyTest {
    public static void main(String[] args) {
        System.out.println("=== Strategy Pattern Demo ===");
        
        // Create shopping cart and add items
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(new Item("Laptop", 999.99));
        cart.addItem(new Item("Mouse", 29.99));
        cart.addItem(new Item("Keyboard", 79.99));
        
        // Show cart contents
        cart.showItems();
        System.out.println();
        
        // Test different payment strategies
        System.out.println("1. Paying with Credit Card:");
        cart.setPaymentStrategy(new CreditCardPayment("1234-5678-9012-3456", "John Doe"));
        cart.checkout();
        System.out.println();
        
        System.out.println("2. Paying with PayPal:");
        cart.setPaymentStrategy(new PayPalPayment("john.doe@email.com"));
        cart.checkout();
        System.out.println();
        
        System.out.println("3. Paying with Bitcoin:");
        cart.setPaymentStrategy(new BitcoinPayment("1A1zP1eP5QGefi2DMPTfTL5SLmv7DivfNa"));
        cart.checkout();
        System.out.println();
        
        System.out.println("4. Trying to checkout without payment strategy:");
        cart.setPaymentStrategy(null);
        cart.checkout();
    }
}