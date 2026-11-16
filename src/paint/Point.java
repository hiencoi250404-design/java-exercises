package paint;

public class Point extends AbstractShape {

    public Point() {
        super();
    }

    public Point(double x, double y) {
        super(x, y);
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public double perimeter() {
        return 0;
    }

    @Override
    public String toString() {
        return "Point(" + x + ", " + y + ")";
    }
}