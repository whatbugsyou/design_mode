package main.flyweight;

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