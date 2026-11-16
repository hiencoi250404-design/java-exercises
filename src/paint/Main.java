package paint;

public class Main {

    public static void main(String[] args) {

        Point p1 = new Point(2, 3);
        Point p2 = new Point(5, 7);

        System.out.println(p1);
        System.out.println(p2);

        System.out.println("Khoang cach: " + p1.distance(p2));

        p1.move(2, 2);

        System.out.println("Sau khi di chuyen:");
        System.out.println(p1);

        System.out.println("Dien tich: " + p1.area());
    }
}
