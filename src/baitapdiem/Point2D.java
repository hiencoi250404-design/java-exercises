package baitapdiem;

public class Point2D {

    // 1. Khai bao thuoc tinh
    private double x;
    private double y;

    // 2. Constructor
    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // 3. Getter
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // 4. Setter
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    // 5. Tinh khoang cach giua 2 diem
    public double khoangCach(Point2D d) {
        double dx = this.x - d.x;
        double dy = this.y - d.y;

        return Math.sqrt(dx * dx + dy * dy);
    }

    // 6. Tim diem doi xung qua goc toa do
    public Point2D doiXung() {
        return new Point2D(-x, -y);
    }

    // 7. Tinh tien diem
    public void dichChuyen(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }

    // 8. Hien thi thong tin
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}