
package paint;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        // 1. Tao danh sach ngau nhien gom 10 hinh
        ArrayList<Shape> shapes = taoDanhSachHinh(10);

        // 2. In danh sach cac hinh
        System.out.println("DANH SACH CAC HINH:");

        for (Shape s : shapes) {
            System.out.println(s);
        }

        // 3. Tinh tong dien tich va chu vi
        double tongDienTich = 0;
        double tongChuVi = 0;

        for (Shape s : shapes) {
            tongDienTich += s.area();
            tongChuVi += s.perimeter();
        }

        System.out.println("Tong dien tich: " + tongDienTich);
        System.out.println("Tong chu vi: " + tongChuVi);

        // 4. Tim hinh co dien tich lon nhat va nho nhat
        Shape max = shapes.get(0);
        Shape min = shapes.get(0);

        for (Shape s : shapes) {

            if (s.area() > max.area()) {
                max = s;
            }

            if (s.area() < min.area()) {
                min = s;
            }
        }

        System.out.println("Hinh co dien tich lon nhat:");
        System.out.println(max);
        System.out.println("Dien tich: " + max.area());

        System.out.println("Hinh co dien tich nho nhat:");
        System.out.println(min);
        System.out.println("Dien tich: " + min.area());

        // 5. Phong to tat ca cac hinh
        System.out.println("SAU KHI PHONG TO:");

        for (Shape s : shapes) {
            s.zoom(2);
            System.out.println(s);
        }
    }

    // Ham tao danh sach hinh ngau nhien
    public static ArrayList<Shape> taoDanhSachHinh(int soLuong) {

        ArrayList<Shape> shapes = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < soLuong; i++) {

            int loaiHinh = random.nextInt(5);

            double x = random.nextInt(21) - 10;
            double y = random.nextInt(21) - 10;

            double dai = random.nextInt(10) + 1;
            double rong = random.nextInt(10) + 1;

            switch (loaiHinh) {

                case 0:
                    shapes.add(new Point(x, y));
                    break;

                case 1:
                    shapes.add(new Circle(x, y, dai));
                    break;

                case 2:
                    shapes.add(new Line(x, y, x + dai, y + rong));
                    break;

                case 3:
                    shapes.add(new Triangle(
                            x, y,
                            x + dai, y,
                            x, y + rong
                    ));
                    break;

                case 4:
                    shapes.add(new Rectangle(
                            x, y,
                            x + dai, y,
                            x + dai, y + rong,
                            x, y + rong
                    ));
                    break;
            }
        }

        return shapes;
    }
}
