package main.templateMethod;

public class WakeUp extends Template{
    @Override
    void first() {
        System.out.println("open eyes");
    }

    @Override
    void second() {
        System.out.println("shut the alarm clock");
    }
}
