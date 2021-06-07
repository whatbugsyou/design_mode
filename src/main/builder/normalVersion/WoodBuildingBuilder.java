package main.builder.normalVersion;

public class WoodBuildingBuilder extends Builder{
    private Building woodBuilding;

    @Override
    void initBuilding() {
        woodBuilding = new Building();
    }

    @Override
    void buildMaterials() {
        woodBuilding.setMaterials("wood");
    }

    @Override
    void buildOthers() {

    }

    @Override
    public Building getBuilding() {
        return woodBuilding;
    }
}
