package main.adapter.test;

import main.adapter.Another;
import main.adapter.Origin;
import main.adapter.OriginImpl;
import main.adapter.objectVersion.OriginToAnotherAdaptor;
import org.junit.jupiter.api.Test;

public class ObjectVersionTest {
    @Test
    void test(){
        Origin origin = new OriginImpl();
        Another originToAnotherAdaptor = new OriginToAnotherAdaptor(origin);
        originToAnotherAdaptor.anotherFunction();
    }
}
