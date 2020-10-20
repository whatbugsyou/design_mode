package main.builder.test;

import main.builder.normalVersion.BrickBuildingBuider;
import main.builder.normalVersion.BuilderDirector;
import main.builder.normalVersion.Building;
import main.builder.normalVersion.WoodBuildingBuilder;
import org.junit.jupiter.api.Test;

class NormalBuilderTest {
    @Test
    public void test(){
        Building building;

        BuilderDirector woodBuilderDirector = new BuilderDirector(new WoodBuildingBuilder());
        building = woodBuilderDirector.build();
        System.out.println(building);

        BuilderDirector brickBuilderDirector = new BuilderDirector(new BrickBuildingBuider());
        building = brickBuilderDirector.build();
        System.out.println(building);

    }
}