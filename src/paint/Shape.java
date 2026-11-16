package paint;

public interface Shape {

    double area();
    double distance(Shape other);

    double perimeter();

    void move(double dx, double dy);

    void rotate(double angle);

    void zoom(double ratio);
}