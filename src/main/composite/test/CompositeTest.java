package main.composite.test;

import main.composite.*;

public class CompositeTest {
    public static void main(String[] args) {
        System.out.println("=== Composite Pattern Demo - Restaurant Menu ===\n");
        
        // Create menu components
        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent dinerMenu = new Menu("DINER MENU", "Lunch");
        MenuComponent cafeMenu = new Menu("CAFE MENU", "Dinner");
        MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert of course!");
        
        // Create the main menu
        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");
        
        // Add menus to main menu
        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);
        
        // Add menu items to pancake house menu
        pancakeHouseMenu.add(new MenuItem(
            "K&B's Pancakes",
            "Pancakes with scrambled eggs, and toast",
            true, 2.99));
        pancakeHouseMenu.add(new MenuItem(
            "Regular Pancakes",
            "Pancakes with fried eggs, sausage",
            false, 2.99));
        pancakeHouseMenu.add(new MenuItem(
            "Blueberry Pancakes",
            "Pancakes made with fresh blueberries",
            true, 3.49));
        pancakeHouseMenu.add(new MenuItem(
            "Waffles",
            "Waffles, with your choice of blueberries or strawberries",
            true, 3.59));
        
        // Add menu items to diner menu
        dinerMenu.add(new MenuItem(
            "Vegetarian BLT",
            "(Fakin') Bacon with lettuce & tomato on whole wheat",
            true, 2.99));
        dinerMenu.add(new MenuItem(
            "BLT",
            "Bacon with lettuce & tomato on whole wheat",
            false, 2.99));
        dinerMenu.add(new MenuItem(
            "Soup of the day",
            "Soup of the day, with a side of potato salad",
            false, 3.29));
        dinerMenu.add(new MenuItem(
            "Hotdog",
            "A hot dog, with saurkraut, relish, onions, topped with cheese",
            false, 3.05));
        
        // Add dessert menu to diner menu (nested menu)
        dinerMenu.add(dessertMenu);
        
        // Add items to dessert menu
        dessertMenu.add(new MenuItem(
            "Apple Pie",
            "Apple pie with a flakey crust, topped with vanilla ice cream",
            true, 1.59));
        dessertMenu.add(new MenuItem(
            "Cheesecake",
            "Creamy New York cheesecake, with a chocolate graham crust",
            true, 1.99));
        dessertMenu.add(new MenuItem(
            "Sorbet",
            "A scoop of raspberry and a scoop of lime",
            true, 1.89));
        
        // Add menu items to cafe menu
        cafeMenu.add(new MenuItem(
            "Veggie Burger and Air Fries",
            "Veggie burger on a whole wheat bun, lettuce, tomato, and fries",
            true, 3.99));
        cafeMenu.add(new MenuItem(
            "Soup of the day",
            "A cup of the soup of the day, with a side salad",
            false, 3.69));
        cafeMenu.add(new MenuItem(
            "Burrito",
            "A large burrito, with whole pinto beans, salsa, guacamole",
            true, 4.29));
        
        // Create waitress and test
        Waitress waitress = new Waitress(allMenus);
        
        System.out.println("Printing entire menu:");
        waitress.printMenu();
        
        System.out.println("\n" + "=".repeat(50));
        waitress.printVegetarianMenu();
    }
}