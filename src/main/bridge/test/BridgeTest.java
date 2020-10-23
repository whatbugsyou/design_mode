package main.bridge.test;

import main.bridge.Red;
import main.bridge.Star;
import org.junit.jupiter.api.Test;

public class BridgeTest {
    @Test
    void test(){
        Star star = new Star();
        star.setColor(new Red());
        star.description();
    }
}
