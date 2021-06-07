package main.builder.normalVersion;

public class BuilderDirector {
    private Builder builder;

    public BuilderDirector(Builder builder) {
        this.builder = builder;
    }
    public Building build(){
        builder.initBuilding();
        builder.buildMaterials();
        builder.buildOthers();
        return builder.getBuilding();
    }
}
