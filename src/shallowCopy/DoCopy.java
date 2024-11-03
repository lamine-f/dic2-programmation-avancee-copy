package shallowCopy;

import geometry.Circle;

public class DoCopy {
    public static Circle execute (Circle circle) {
        return new Circle(circle.getRadius(), circle.getCenter());
    }
}
