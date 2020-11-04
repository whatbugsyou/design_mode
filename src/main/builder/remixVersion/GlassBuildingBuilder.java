package main.builder.remixVersion;

import main.builder.normalVersion.Building;

public class GlassBuildingBuilder extends Builder{
    private Building glassBuilding = new Building();
    @Override
    void buildMaterials() {
        glassBuilding.setMaterials("glass");
    }

    @Override
    Building createBuilding() {
        return glassBuilding;
    }
}
