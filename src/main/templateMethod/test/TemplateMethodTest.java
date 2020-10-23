package main.templateMethod.test;

import main.templateMethod.GrowUp;
import main.templateMethod.WakeUp;
import org.junit.jupiter.api.Test;

public class TemplateMethodTest {
    @Test
    void test(){
        GrowUp growUp = new GrowUp();
        WakeUp wakeUp = new WakeUp();
        growUp.templeteMethod();
        wakeUp.templeteMethod();
    }

}
