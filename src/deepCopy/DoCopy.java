package deepCopy;

import geometry.Circle;
import geometry.Point;

public class DoCopy {
    public static Circle execute (Circle circle) {
        Point center = new Point(circle.getCenter().getX(), circle.getCenter().getY());
        return new Circle(circle.getRadius(), center);
    }
}
