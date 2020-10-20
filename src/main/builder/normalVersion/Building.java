package main.builder.normalVersion;

public class Building {
    private String materials;

    public void setMaterials(String materials) {
        this.materials = materials;
    }

    public Building() {
    }

    public Building(String materials) {
        this.materials = materials;
    }

    @Override
    public String toString() {
        return "Building{" +
                "materials='" + materials + '\'' +
                '}';
    }
}
