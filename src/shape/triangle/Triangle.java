package shape.triangle;

import shape.AbstractShape;
import java.util.logging.Logger;

public class Triangle extends AbstractShape {
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public static final Logger logger = Logger.getLogger(Triangle.class.getName());
    double base;
    double height;
    double area;
    @Override
    public void getArea() {
        area = (base * height) / 2;
        logger.info("Triangle area is " + area);
    }
}
