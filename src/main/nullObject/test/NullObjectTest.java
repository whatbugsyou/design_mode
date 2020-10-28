package main.nullObject.test;

import main.nullObject.Base;
import main.nullObject.BaseFactory;
import org.junit.jupiter.api.Test;

public class NullObjectTest {
    @Test
    void test(){
        Base alice = BaseFactory.getCustomer("Alice");
        Base bob = BaseFactory.getCustomer("Bob");
        Base somebody_else = BaseFactory.getCustomer("Somebody else");
        alice.print();
        bob.print();
        somebody_else.print();
    }
}
