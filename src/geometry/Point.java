package geometry;

public class Point {
    double x;
    double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public String convertToString() {
        return "Point{" +
                "reference=" + this +
                ", x=" + x +
                ", y=" + y +
                '}';
    }

}
