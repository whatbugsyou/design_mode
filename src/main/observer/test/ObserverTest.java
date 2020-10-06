package main.observer.test;

import org.junit.jupiter.api.Test;


class ObserverTest {
    @Test
    public void test(){
        Light light = new Light();
        Siri siri = new Siri();
        XiaoAi xiaoAi = new XiaoAi();
        light.addObserver(siri);
        light.addObserver(xiaoAi);
        light.setStatus(true);
        light.setStatus(false);
    }
}