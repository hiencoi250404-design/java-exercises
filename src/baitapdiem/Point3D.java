package baitapdiem;

public class Point3D extends Point2D {

    // 1. Them thuoc tinh z
    private double z;

    // 2. Constructor
    public Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    // 3. Getter va Setter
    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    // 4. Tinh khoang cach giua 2 diem 3D
    public double khoangCach(Point3D d) {
        double dx = getX() - d.getX();
        double dy = getY() - d.getY();
        double dz = this.z - d.z;

        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }

    // 5. Dinh nghia lai ham doi xung
    @Override
    public Point3D doiXung() {
        return new Point3D(-getX(), -getY(), -z);
    }

    // 6. Tinh tien diem 3D
    public void dichChuyen(double dx, double dy, double dz) {
        super.dichChuyen(dx, dy);
        this.z += dz;
    }

    // 7. Dinh nghia lai toString
    @Override
    public String toString() {
        return "(" + getX() + ", " + getY() + ", " + z + ")";
    }
}