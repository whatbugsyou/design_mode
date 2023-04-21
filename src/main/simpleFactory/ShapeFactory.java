package main.simpleFactory;

public class ShapeFactory {
    public static Shape getShape(String type) {
        if (type == null) {
            return null;
        }
        if (type.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        } else if (type.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if (type.equalsIgnoreCase("triangle")) {
            return new Triangle();
        }
        return null;
    }
}