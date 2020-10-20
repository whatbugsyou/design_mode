package main.builder.test;

import main.builder.selfVersion.Building;
import org.junit.jupiter.api.Test;

public class SelfBuilderTest {
    @Test
    public void test(){
        Building building = new Building.Builder()
                .materials("golden")
                .build();
        System.out.println(building);
    }
}
