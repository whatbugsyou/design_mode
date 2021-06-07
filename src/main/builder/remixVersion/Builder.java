package main.builder.remixVersion;

import main.builder.normalVersion.Building;

public abstract class Builder {
    abstract void initBuilding();
    abstract void buildMaterials();
    abstract void buildOthers();
    abstract Building getBuilding();
    public Building build(){
        initBuilding();
        buildMaterials();
        buildOthers();
        return getBuilding();
    }
}
