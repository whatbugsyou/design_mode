package main.simpleFactory.test;

import main.simpleFactory.Shape;
import main.simpleFactory.ShapeFactory;
import org.junit.jupiter.api.Test;

public class SimpleFactoryTest {

    @Test
    void test() {
        Shape rectangle = ShapeFactory.getShape("rectangle");
        rectangle.draw();  // 输出：绘制矩形

        Shape circle = ShapeFactory.getShape("circle");
        circle.draw();     // 输出：绘制圆形

        Shape triangle = ShapeFactory.getShape("triangle");
        triangle.draw();   // 输出：绘制三角形
    }
}
