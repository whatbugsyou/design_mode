package main.delegate.test;

import main.delegate.Delegator;
import org.junit.jupiter.api.Test;

class DelegatorTest {
    @Test
    public void test(){
        Delegator delegator = new Delegator();
        String need = "planet";
        delegator.code(need);
    }
}