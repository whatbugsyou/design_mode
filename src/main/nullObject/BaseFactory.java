package main.nullObject;

public class BaseFactory {
    public static final String[] names = {"Alice", "Bob"};
    public static Base getCustomer(String name){
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(name)){
                return new Normal(name);
            }
        }
        return new NullObject();
    }
}
