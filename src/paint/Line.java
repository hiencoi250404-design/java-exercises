
package paint;

public class Line extends AbstractShape {

    private double x2;
    private double y2;

    public Line() {
        super();
        this.x2 = 1;
        this.y2 = 1;
    }

    public Line(double x1, double y1, double x2, double y2) {
        super(x1, y1);
        this.x2 = x2;
        this.y2 = y2;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }

    // Tính độ dài đoạn thẳng
    @Override
    public double perimeter() {
        double dx = x2 - x;
        double dy = y2 - y;

        return Math.sqrt(dx * dx + dy * dy);
    }

    // Đoạn thẳng không có diện tích
    @Override
    public double area() {
        return 0;
    }

    // Di chuyển cả hai đầu đoạn thẳng
    @Override
    public void move(double dx, double dy) {
        x += dx;
        y += dy;

        x2 += dx;
        y2 += dy;
    }

    // Phóng to cả hai đầu đoạn thẳng
    @Override
    public void zoom(double ratio) {
        if (ratio <= 0) {
            throw new IllegalArgumentException("Ratio must be positive");
        }

        x *= ratio;
        y *= ratio;
        x2 *= ratio;
        y2 *= ratio;
    }

    // Xoay cả hai đầu quanh gốc tọa độ
    @Override
    public void rotate(double angle) {
        double rad = Math.toRadians(angle);

        double newX1 = x * Math.cos(rad) - y * Math.sin(rad);
        double newY1 = x * Math.sin(rad) + y * Math.cos(rad);

        double newX2 = x2 * Math.cos(rad) - y2 * Math.sin(rad);
        double newY2 = x2 * Math.sin(rad) + y2 * Math.cos(rad);

        x = newX1;
        y = newY1;
        x2 = newX2;
        y2 = newY2;
    }

    @Override
    public String toString() {
        return "Line: (" + x + ", " + y + ") -> ("
                + x2 + ", " + y2 + ")";
    }
}
