package phamchithien.buoi6;

import java.util.Scanner;

public class Thien107582_1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập thông tin cho Trường hợp 1 (dữ liệu kiểu String)
        System.out.println("Nhập họ và tên:");
        String hoTen1 = scanner.nextLine();

        System.out.println("Nhập ngày sinh (dd/MM/yyyy):");
        String ngaySinh1 = scanner.nextLine();

        System.out.println("Nhập điểm tổng kết (dạng số thực):");
        String diemTongKet1 = scanner.nextLine();

        System.out.println("Nhập tuổi (dạng số nguyên):");
        String tuoi1 = scanner.nextLine();

        // Chuyển đổi kiểu dữ liệu từ String sang kiểu phù hợp
        float diemTongKet1Float = Float.parseFloat(diemTongKet1);  
        int tuoi1Int = Integer.parseInt(tuoi1);                    

        System.out.println("\n-----THÔNG TIN SINH VIÊN-----");
        System.out.println("Họ và tên: " + hoTen1 + " (String)");
        System.out.println("Ngày sinh: " + ngaySinh1 + " (String)");
        System.out.println("Điểm tổng kết: " + diemTongKet1Float + " (Float)");
        System.out.println("Tuổi: " + tuoi1Int + " (Int)");
        System.out.println("-----HẾT-----");

        // Nhập thông tin cho Trường hợp 2 (dữ liệu đã ở kiểu phù hợp)
        System.out.println("\nNhập thông tin cho Trường hợp 2:");

        System.out.println("Nhập họ và tên:");
        String hoTen2 = scanner.nextLine();

        System.out.println("Nhập ngày sinh (dd/MM/yyyy):");
        String ngaySinh2 = scanner.nextLine();

        System.out.println("Nhập điểm tổng kết (dạng số thực):");
        Float diemTongKet2 = scanner.nextFloat();

        System.out.println("Nhập tuổi (dạng số nguyên):");
        int tuoi2 = scanner.nextInt();

        System.out.println("\n-----THÔNG TIN SINH VIÊN-----");
        System.out.println("Họ và tên: " + hoTen2 + " (String)");
        System.out.println("Ngày sinh: " + ngaySinh2 + " (String)");
        System.out.println("Điểm tổng kết: " + diemTongKet2 + " (Float)");
        System.out.println("Tuổi: " + tuoi2 + " (Int)");
        System.out.println("-----HẾT-----");

        scanner.close();
    }
}
