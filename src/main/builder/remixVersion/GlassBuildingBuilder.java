package main.builder.remixVersion;

import main.builder.normalVersion.Building;

public class GlassBuildingBuilder extends Builder{
    private Building glassBuilding;

    @Override
    void initBuilding() {
        glassBuilding = new Building();
    }

    @Override
    void buildMaterials() {
        glassBuilding.setMaterials("glass");
    }

    @Override
    void buildOthers() {

    }

    @Override
    Building getBuilding() {
        return glassBuilding;
    }
}
