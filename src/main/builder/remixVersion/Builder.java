package main.builder.remixVersion;

import main.builder.normalVersion.Building;

public abstract class Builder {
    abstract void buildMaterials();
    abstract Building createBuilding();
    public Building build(){
        buildMaterials();
        return createBuilding();
    }
}
