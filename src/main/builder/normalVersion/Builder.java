package main.builder.normalVersion;

public abstract class Builder {
    abstract void initBuilding();
    abstract void buildMaterials();
    abstract void buildOthers();
    abstract Building getBuilding();
}
