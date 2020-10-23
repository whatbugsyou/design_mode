package main.facade.test;

import main.facade.Facade;
import org.junit.jupiter.api.Test;

class FacadeTest {
    @Test
    void test(){
        Facade facade = new Facade();
        facade.aDo();
        facade.bDo();
        facade.cDp();
    }
}