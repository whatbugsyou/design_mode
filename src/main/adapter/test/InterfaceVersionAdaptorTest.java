package main.adapter.test;

import main.adapter.Another;
import main.adapter.Origin;
import main.adapter.OriginImpl;
import main.adapter.interfaceVersion.OriginToAnotherAdaptor;
import org.junit.jupiter.api.Test;

class InterfaceVersionAdaptorTest {
    @Test
    void test(){
        Origin origin = new OriginImpl();
        Another originToAnotherAdaptor = new OriginToAnotherAdaptor(origin);
        originToAnotherAdaptor.anotherFunction();
    }
}