package shape.circle;

import shape.AbstractShape;
import java.util.logging.Logger;

public class Circle extends AbstractShape {

    public Circle(double radius) {
        this.radius = radius;
    }

    private static final Logger logger = Logger.getLogger(Circle.class.getName());
    double radius;

    @Override
    public void getArea() {
        double area = Math.PI * (radius * radius);
        logger.info("Circle area is " + area);
    }
}
