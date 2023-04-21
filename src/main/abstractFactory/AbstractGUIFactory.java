package main.abstractFactory;

public interface AbstractGUIFactory {
    Window createWindow();
    Button createButton();
}