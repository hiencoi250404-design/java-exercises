package baitapdiem;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // 1. Tao danh sach diem
        ArrayList<Point2D> ds = new ArrayList<>();

        // Them cac diem 2D
        ds.add(new Point2D(1, 2));
        ds.add(new Point2D(3, 4));
        ds.add(new Point2D(5, 6));

        // Them cac diem 3D
        ds.add(new Point3D(1, 2, 3));
        ds.add(new Point3D(4, 5, 6));
        ds.add(new Point3D(7, 8, 9));

        // 2. Hien thi danh sach ban dau
        System.out.println("===== DANH SACH DIEM BAN DAU =====");

        for (Point2D d : ds) {
            System.out.println(d);
        }

        // 3. Tach danh sach diem 2D va 3D
        ArrayList<Point2D> ds2D = new ArrayList<>();
        ArrayList<Point3D> ds3D = new ArrayList<>();

        for (Point2D d : ds) {

            if (d instanceof Point3D) {
                ds3D.add((Point3D) d);
            } else {
                ds2D.add(d);
            }
        }

        // 4. Tinh tong khoang cach cac diem 2D
        double tong2D = 0;

        for (int i = 0; i < ds2D.size() - 1; i++) {
            tong2D += ds2D.get(i).khoangCach(ds2D.get(i + 1));
        }

        System.out.println("\nTong khoang cach cac diem 2D: " + tong2D);

        // 5. Tinh tong khoang cach cac diem 3D
        double tong3D = 0;

        for (int i = 0; i < ds3D.size() - 1; i++) {
            tong3D += ds3D.get(i).khoangCach(ds3D.get(i + 1));
        }

        System.out.println("Tong khoang cach cac diem 3D: " + tong3D);

        // 6. Dua cac diem doi xung vao danh sach
        ArrayList<Point2D> dsDoiXung = new ArrayList<>();

        for (Point2D d : ds) {
            dsDoiXung.add(d.doiXung());
        }

        // Them cac diem doi xung vao danh sach goc
        ds.addAll(dsDoiXung);

        // 7. Hien thi danh sach sau khi them diem doi xung
        System.out.println("\n===== DANH SACH SAU KHI THEM DIEM DOI XUNG =====");

        for (Point2D d : ds) {
            System.out.println(d);
        }
    }
}