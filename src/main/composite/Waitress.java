package main.composite;

import java.util.Iterator;

public class Waitress {
    private MenuComponent allMenus;
    
    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }
    
    public void printMenu() {
        allMenus.print();
    }
    
    public void printVegetarianMenu() {
        System.out.println("\nVEGETARIAN MENU\n----");
        Iterator<MenuComponent> iterator = allMenus.createIterator();
        
        while (iterator.hasNext()) {
            MenuComponent menuComponent = iterator.next();
            try {
                if (menuComponent.isVegetarian()) {
                    menuComponent.print();
                }
            } catch (UnsupportedOperationException e) {
                // This is a menu, not a menu item - skip it
            }
        }
    }
}