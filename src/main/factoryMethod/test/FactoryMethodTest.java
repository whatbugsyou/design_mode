package main.factoryMethod.test;

import main.factoryMethod.CircleDrawerFactory;
import main.factoryMethod.Drawer;
import org.junit.jupiter.api.Test;

public class FactoryMethodTest {
    @Test
    void test() {
        CircleDrawerFactory circleDrawerFactory = new CircleDrawerFactory();
        Drawer drawer = circleDrawerFactory.createDrawer();
        //the client do not know the level of drawer,maybe green hand or master
        drawer.work();
    }
}
