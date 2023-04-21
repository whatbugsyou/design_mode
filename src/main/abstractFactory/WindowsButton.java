package main.abstractFactory;

public class WindowsButton extends Button {
    @Override
    public void click() {
        System.out.println("Windows Button");
    }
}