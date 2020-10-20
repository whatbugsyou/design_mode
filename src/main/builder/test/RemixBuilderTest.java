package main.builder.test;

import main.builder.remixVersion.GlassBuildingBuilder;
import main.builder.normalVersion.Building;
import org.junit.jupiter.api.Test;

class RemixBuilderTest {
    @Test
    public void test(){
        Building building;
        building = new GlassBuildingBuilder().build();
        System.out.println(building);
    }
}