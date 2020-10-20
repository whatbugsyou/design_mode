package main.builder.normalVersion;

public class BrickBuildingBuider extends Builder{
    private Building brickBuiding = new Building();
    @Override
    void buildMaterials() {
        brickBuiding.setMaterials("brick");
    }

    @Override
    public Building createBuiding() {
        return brickBuiding;
    }
}
