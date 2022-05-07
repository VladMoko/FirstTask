package shapeTest;

import shape.circle.Circle;
import shape.square.Square;
import shape.triangle.Triangle;

public class ShapeTest {
    public static void main(String[] args) {
        Circle circle = new Circle(2);
        Square square = new Square(2);
        Triangle triangle = new Triangle(23,3
        );

        triangle.getArea();
        square.getArea();
        circle.getArea();
    }
}
