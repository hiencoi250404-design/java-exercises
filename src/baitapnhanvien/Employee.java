package baitapnhanvien;

import java.util.Scanner;

public class Employee extends Person {

    // 1. Khai bao thuoc tinh bo sung
    private int snct;
    private double hsl;

    // 2. Constructor
    public Employee() {
    }

    public Employee(String hoTen, int tuoi, int snct, double hsl) {
        super(hoTen, tuoi);
        this.snct = snct;
        this.hsl = hsl;
    }

    // 3. Getter
    public int getSnct() {
        return snct;
    }

    public double getHsl() {
        return hsl;
    }

    // 4. Setter
    public void setSnct(int snct) {
        this.snct = snct;
    }

    public void setHsl(double hsl) {
        this.hsl = hsl;
    }

    // 5. Ham nhap thong tin nhan vien
    @Override
    public void input(Scanner sc) {
        super.input(sc);

        System.out.print("Nhap so nam cong tac: ");
        snct = sc.nextInt();

        System.out.print("Nhap he so luong: ");
        hsl = sc.nextDouble();

        sc.nextLine();
    }

    // 6. Ham tinh tien luong
    public double calculateSalary() {
        double lcb = 1500000;
        double phucap = 200000 * snct;

        return lcb * hsl + phucap;
    }

    // 7. Ham xuat thong tin nhan vien
    @Override
    public void output() {
        super.output();

        System.out.println("So nam cong tac: " + snct);
        System.out.println("He so luong: " + hsl);
        System.out.printf("Tien luong: %.0f VND%n", calculateSalary());
    }
}