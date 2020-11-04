package main.criteria;

public class Apple {
    private String color;
    private Boolean isBig;

    public Apple(String color, Boolean isBig) {
        this.color = color;
        this.isBig = isBig;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                ", isBig=" + isBig +
                '}';
    }

    public Boolean getBig() {
        return isBig;
    }
}
