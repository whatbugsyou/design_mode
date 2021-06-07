package main.factoryMethod.test;

import main.factoryMethod.AbstractFactory;
import main.factoryMethod.ProductAFactory;
import main.factoryMethod.ProductBFactory;
import org.junit.jupiter.api.Test;

public class FactoryMethodTest {
    @Test
    void test() {
        AbstractFactory abstractFactory = null;

        abstractFactory = new ProductAFactory();
        abstractFactory.bizCode();

        abstractFactory = new ProductBFactory();
        abstractFactory.bizCode();
    }
}
