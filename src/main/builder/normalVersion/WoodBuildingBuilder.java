package main.builder.normalVersion;

public class WoodBuildingBuilder extends Builder{
    private Building woodBuiding = new Building();

    @Override
    void buildMaterials() {
        woodBuiding.setMaterials("wood");
    }

    @Override
    public Building createBuiding() {
        return woodBuiding;
    }
}
