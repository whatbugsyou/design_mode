package main.flyweight.test;

import main.flyweight.Base;
import main.flyweight.Pool;
import org.junit.jupiter.api.Test;

class PoolTest {
    @Test
    void test() {
        Base dog = Pool.getBase("dog");
        Base dog1 = Pool.getBase("dog");
        boolean b = dog == dog1;
        System.out.println(b); //true
    }
}