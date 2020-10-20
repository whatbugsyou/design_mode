package main.builder.remixVersion;

import main.builder.normalVersion.Building;

public abstract class Builder {
    abstract void buildMaterials();
    abstract Building createBuiding();
    public Building build(){
        buildMaterials();
        return createBuiding();
    }
}
