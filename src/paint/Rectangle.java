
package paint;

public class Rectangle extends AbstractShape {

    private double x2, y2;
    private double x3, y3;
    private double x4, y4;

    // Constructor không tham số
    public Rectangle() {
        this(0, 0, 4, 0, 4, 2, 0, 2);
    }

    // Constructor có tham số
    public Rectangle(double x1, double y1,
                     double x2, double y2,
                     double x3, double y3,
                     double x4, double y4) {

        super(x1, y1);
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
        this.x4 = x4;
        this.y4 = y4;
    }

    // Tính độ dài giữa hai điểm
    private double distance(double ax, double ay,
                            double bx, double by) {
        double dx = bx - ax;
        double dy = by - ay;

        return Math.sqrt(dx * dx + dy * dy);
    }

    // Chiều dài
    private double length() {
        return distance(x, y, x2, y2);
    }

    // Chiều rộng
    private double width() {
        return distance(x2, y2, x3, y3);
    }

    // Tính chu vi
    @Override
    public double perimeter() {
        return 2 * (length() + width());
    }

    // Tính diện tích
    @Override
    public double area() {
        return length() * width();
    }

    // Di chuyển 4 đỉnh
    @Override
    public void move(double dx, double dy) {
        x += dx;
        y += dy;

        x2 += dx;
        y2 += dy;

        x3 += dx;
        y3 += dy;

        x4 += dx;
        y4 += dy;
    }

    // Phóng to 4 đỉnh quanh gốc tọa độ
    @Override
    public void zoom(double ratio) {
        if (ratio <= 0) {
            throw new IllegalArgumentException("Ratio must be positive");
        }

        x *= ratio;
        y *= ratio;

        x2 *= ratio;
        y2 *= ratio;

        x3 *= ratio;
        y3 *= ratio;

        x4 *= ratio;
        y4 *= ratio;
    }

    // Xoay 4 đỉnh quanh gốc tọa độ
    @Override
    public void rotate(double angle) {
        double rad = Math.toRadians(angle);

        double newX1 = x * Math.cos(rad) - y * Math.sin(rad);
        double newY1 = x * Math.sin(rad) + y * Math.cos(rad);

        double newX2 = x2 * Math.cos(rad) - y2 * Math.sin(rad);
        double newY2 = x2 * Math.sin(rad) + y2 * Math.cos(rad);

        double newX3 = x3 * Math.cos(rad) - y3 * Math.sin(rad);
        double newY3 = x3 * Math.sin(rad) + y3 * Math.cos(rad);

        double newX4 = x4 * Math.cos(rad) - y4 * Math.sin(rad);
        double newY4 = x4 * Math.sin(rad) + y4 * Math.cos(rad);

        x = newX1;
        y = newY1;

        x2 = newX2;
        y2 = newY2;

        x3 = newX3;
        y3 = newY3;

        x4 = newX4;
        y4 = newY4;
    }

    @Override
    public String toString() {
        return "Rectangle: A(" + x + ", " + y
                + "), B(" + x2 + ", " + y2
                + "), C(" + x3 + ", " + y3
                + "), D(" + x4 + ", " + y4 + ")";
    }
}
