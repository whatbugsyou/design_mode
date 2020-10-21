package main.adapter.test;

import main.adapter.Another;
import main.adapter.classVersion.OriginToAnotherAdaptor;
import org.junit.jupiter.api.Test;

public class ClassVersionTest {
    @Test
    void test(){
        Another originToAnotherAdaptor = new OriginToAnotherAdaptor();
        originToAnotherAdaptor.anotherFunction();
    }
}
