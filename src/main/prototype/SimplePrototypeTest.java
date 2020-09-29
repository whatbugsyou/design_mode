package main.prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimplePrototypeTest {

    @Test
    void testClone() {
        SimplePrototype simplePrototype = new SimplePrototype();
        SimplePrototype clone = null;
        clone = simplePrototype.clone();
        boolean b = simplePrototype == clone;
        System.out.println(b);
    }
}