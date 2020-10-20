package main.builder.normalVersion;

public class BuilderDirector {
    private Builder builder;

    public BuilderDirector(Builder builder) {
        this.builder = builder;
    }
    public Building build(){
        builder.buildMaterials();
        return builder.createBuiding();
    }
}
