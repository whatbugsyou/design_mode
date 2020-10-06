package main.prototype.test;

import main.prototype.SimplePrototype;
import org.junit.jupiter.api.Test;

class SimplePrototypeTest {

    @Test
    void testClone() {
        long times = 100;
        long t1 = System.currentTimeMillis();
        for (int i = 0; i < times; i++) {
            SimplePrototype simplePrototype = new SimplePrototype();
        }
        long t2 = System.currentTimeMillis();
        SimplePrototype simplePrototype = new SimplePrototype();
        for (int i = 0; i < times; i++) {
            SimplePrototype clone = simplePrototype.clone();
        }
        long t3 = System.currentTimeMillis();
        System.out.println("new :"+(t2-t1)+ "ms");
        System.out.println("clone :"+(t3-t2)+"ms");
    }
}