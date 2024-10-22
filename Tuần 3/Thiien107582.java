package phamchithien;

import java.util.Scanner;

public class Thiien107582 {

    public static String gioiTinh(boolean gt) {
        return gt ? "Nam" : "Nu";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap ma sinh vien: ");
        String maSV = scanner.nextLine();

        System.out.print("Nhap ho va ten: ");
        String hoTen = scanner.nextLine();

        System.out.print("Nhap ngay sinh (dd/MM/yyyy): ");
        String ngaySinh = scanner.nextLine();

        System.out.print("Nhap tuoi: ");
        int tuoi = scanner.nextInt();

        System.out.print("Gioi tinh (1: Nam, 0: Nu): ");
        int gtInput = scanner.nextInt();
        boolean gt = (gtInput == 1);

        scanner.nextLine();

        System.out.print("Nhap lop: ");
        String lop = scanner.nextLine();

        System.out.print("Nhap khoa: ");
        String khoa = scanner.nextLine();

        System.out.print("Nhap dia chi: ");
        String diaChi = scanner.nextLine();

        System.out.println("-----THONG TIN SINH VIEN-----");
        System.out.println("Ma sinh vien: " + maSV);
        System.out.println("Ho va ten: " + hoTen);
        System.out.println("Ngay sinh: " + ngaySinh);
        System.out.println("Tuoi: " + tuoi);
        System.out.println("Gioi tinh: " + gioiTinh(gt));
        System.out.println("Lop: " + lop);
        System.out.println("Khoa: " + khoa);
        System.out.println("Dia Chi: " + diaChi);
        System.out.println("-----HET-----");

        scanner.close();
    }
}