package main.decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecoratorTest {

    @Test
    void test() {
        Origin origin = new Origin();
        Decorator decorator = new Decorator(origin);
        decorator.dosomthing();
    }
}