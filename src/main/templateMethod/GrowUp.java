package main.templateMethod;

public class GrowUp extends Template{
    @Override
    void first() {
        System.out.println("walk");
    }

    @Override
    void second() {
        System.out.println("run");
    }
}
