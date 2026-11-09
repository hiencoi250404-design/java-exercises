package baitapnhanvien;

import java.util.Scanner;

public class Person {

    // 1. Khai bao thuoc tinh
    private String hoTen;
    private int tuoi;

    // 2. Constructor
    public Person() {
    }

    public Person(String hoTen, int tuoi) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
    }

    // 3. Getter
    public String getHoTen() {
        return hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    // 4. Setter
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    // 5. Ham nhap thong tin
    public void input(Scanner sc) {
        System.out.print("Nhap ho ten: ");
        hoTen = sc.nextLine();

        System.out.print("Nhap tuoi: ");
        tuoi = sc.nextInt();
        sc.nextLine();
    }

    // 6. Ham xuat thong tin
    public void output() {
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Tuoi: " + tuoi);
    }
}