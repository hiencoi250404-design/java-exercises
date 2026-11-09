package baitapnhanvien;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1. Nhap so luong nhan vien
        System.out.print("Nhap so luong nhan vien: ");
        int n = sc.nextInt();
        sc.nextLine();

        // 2. Tao danh sach nhan vien
        ArrayList<Employee> ds = new ArrayList<>();

        // 3. Nhap thong tin nhan vien
        for (int i = 0; i < n; i++) {

            System.out.println("\nNhap nhan vien thu " + (i + 1));

            Employee nv = new Employee();

            nv.input(sc);

            ds.add(nv);
        }

        // 4. Tim nhan vien co so nam cong tac nhieu nhat
        Employee max = ds.get(0);

        for (int i = 1; i < ds.size(); i++) {

            if (ds.get(i).getSnct() > max.getSnct()) {
                max = ds.get(i);
            }
        }

        System.out.println("\n===== NHAN VIEN CONG TAC LAU NHAT =====");
        max.output();

        // 5. Sap xep nhan vien theo luong giam dan
        for (int i = 0; i < ds.size() - 1; i++) {

            for (int j = i + 1; j < ds.size(); j++) {

                if (ds.get(i).calculateSalary()
                        < ds.get(j).calculateSalary()) {

                    Employee temp = ds.get(i);
                    ds.set(i, ds.get(j));
                    ds.set(j, temp);
                }
            }
        }

        // 6. In danh sach nhan vien sau khi sap xep
        System.out.println("\n===== DANH SACH NHAN VIEN THEO LUONG GIAM DAN =====");

        for (int i = 0; i < ds.size(); i++) {

            System.out.println("\nNhan vien thu " + (i + 1));

            ds.get(i).output();
        }

        sc.close();
    }
}