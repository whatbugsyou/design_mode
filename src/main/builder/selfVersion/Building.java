package main.builder.selfVersion;

public class Building {
    private String materials;

    public Building(Builder builder) {
        this.materials = builder.materials;
    }

    @Override
    public String toString() {
        return "Building{" +
                "materials='" + materials + '\'' +
                '}';
    }

    public static final class Builder {
        private String materials;

        public Builder() {
        }

        public Builder materials(String materials) {
            this.materials = materials;
            return this;
        }

        public Building build() {
            return new Building(this);
        }
    }
}
