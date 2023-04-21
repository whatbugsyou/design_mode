package main.abstractFactory.test;

import main.abstractFactory.AbstractGUIFactory;
import main.abstractFactory.Button;
import main.abstractFactory.Window;
import main.abstractFactory.WindowsGUIFactory;
import org.junit.jupiter.api.Test;

public class abstractFactoryTest {
    @Test
    public void test(){
        AbstractGUIFactory factory = new WindowsGUIFactory();
        Window window = factory.createWindow();
        Button button = factory.createButton();
        window.draw(); // 输出：Windows Window
        button.click(); // 输出：Windows Button
    }
}
