package main.builder.normalVersion;

public class BrickBuildingBuider extends Builder{
    private Building brickBuilding;

    @Override
    void initBuilding() {
        brickBuilding = new Building();
    }

    @Override
    void buildMaterials() {
        brickBuilding.setMaterials("brick");
    }

    @Override
    void buildOthers() {

    }

    @Override
    public Building getBuilding() {
        return brickBuilding;
    }
}
