
package paint;

public class Triangle extends AbstractShape {

    private double x2, y2;
    private double x3, y3;

    // Constructor không tham số
    public Triangle() {
        super();
        this.x2 = 3;
        this.y2 = 0;
        this.x3 = 0;
        this.y3 = 4;
    }

    // Constructor có tham số
    public Triangle(double x1, double y1,
                    double x2, double y2,
                    double x3, double y3) {

        super(x1, y1);
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }

    // Tính độ dài cạnh
    private double distance(double ax, double ay,
                            double bx, double by) {

        double dx = bx - ax;
        double dy = by - ay;

        return Math.sqrt(dx * dx + dy * dy);
    }

    // Cạnh thứ nhất
    private double sideA() {
        return distance(x, y, x2, y2);
    }

    // Cạnh thứ hai
    private double sideB() {
        return distance(x2, y2, x3, y3);
    }

    // Cạnh thứ ba
    private double sideC() {
        return distance(x3, y3, x, y);
    }

    // Tính chu vi
    @Override
    public double perimeter() {
        return sideA() + sideB() + sideC();
    }

    // Tính diện tích bằng công thức Heron
    @Override
    public double area() {
        double a = sideA();
        double b = sideB();
        double c = sideC();

        double p = perimeter() / 2;

        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    // Di chuyển cả 3 đỉnh
    @Override
    public void move(double dx, double dy) {
        x += dx;
        y += dy;

        x2 += dx;
        y2 += dy;

        x3 += dx;
        y3 += dy;
    }

    // Phóng to cả 3 đỉnh quanh gốc tọa độ
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
    }

    // Xoay cả 3 đỉnh quanh gốc tọa độ
    @Override
    public void rotate(double angle) {
        double rad = Math.toRadians(angle);

        double newX1 = x * Math.cos(rad) - y * Math.sin(rad);
        double newY1 = x * Math.sin(rad) + y * Math.cos(rad);

        double newX2 = x2 * Math.cos(rad) - y2 * Math.sin(rad);
        double newY2 = x2 * Math.sin(rad) + y2 * Math.cos(rad);

        double newX3 = x3 * Math.cos(rad) - y3 * Math.sin(rad);
        double newY3 = x3 * Math.sin(rad) + y3 * Math.cos(rad);

        x = newX1;
        y = newY1;

        x2 = newX2;
        y2 = newY2;

        x3 = newX3;
        y3 = newY3;
    }

    @Override
    public String toString() {
        return "Triangle: A(" + x + ", " + y
                + "), B(" + x2 + ", " + y2
                + "), C(" + x3 + ", " + y3 + ")";
    }
}
