package paint;

public abstract class AbstractShape implements Shape {

    protected double x;
    protected double y;

    public AbstractShape() {
        this.x = 0;
        this.y = 0;
    }

    public AbstractShape(double x, double y) {
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

    @Override
    public void move(double dx, double dy) {
        x += dx;
        y += dy;
    }

    @Override
    public double distance(Shape other) {
        AbstractShape s = (AbstractShape) other;

        double dx = x - s.x;
        double dy = y - s.y;

        return Math.sqrt(dx * dx + dy * dy);
    }

    @Override
    public void rotate(double angle) {
        double rad = Math.toRadians(angle);

        double newX = x * Math.cos(rad) - y * Math.sin(rad);
        double newY = x * Math.sin(rad) + y * Math.cos(rad);

        x = newX;
        y = newY;
    }

    @Override
    public void zoom(double ratio) {
        if (ratio <= 0) {
            throw new IllegalArgumentException("Ratio must be positive");
        }

        x *= ratio;
        y *= ratio;
    }

    public abstract double area();

    public abstract double perimeter();
}