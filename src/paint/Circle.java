
package paint;

public class Circle extends AbstractShape {

    private double radius;

    // Constructor không tham số
    public Circle() {
        super();
        this.radius = 1;
    }

    // Constructor có tham số
    public Circle(double x, double y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    // Getter
    public double getRadius() {
        return radius;
    }

    // Setter
    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        }
    }

    // Tính diện tích
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    // Tính chu vi
    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    // Phóng to hình tròn
    @Override
    public void zoom(double ratio) {
        if (ratio <= 0) {
            throw new IllegalArgumentException("Ratio must be positive");
        }

        super.zoom(ratio);
        radius *= ratio;
    }

    @Override
    public String toString() {
        return "Circle: center=(" + x + ", " + y
                + "), radius=" + radius;
    }
}
