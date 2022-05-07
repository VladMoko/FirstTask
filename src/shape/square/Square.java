package shape.square;

import shape.AbstractShape;
import java.util.logging.Logger;

public class Square extends AbstractShape {
    public Square(int size) {
        this.size = size;
    }

    public static final Logger logger = Logger.getLogger(Square.class.getName());
    int size;
    int area;

    @Override
    public void getArea() {
        area = size * size;
        logger.info("Square area is " + area);
    }
}
