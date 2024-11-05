package geometry;

public class Circle {
    double radius;
    Point center;

    public Circle(double radius, Point point) {
        this.radius = radius;
        this.center = point;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public String convertToString() {
        return "Circle{" +
                "reference=" + this +
                ", radius=" + radius +
                ", center=" + center.convertToString() +
                '}';
    }
}
