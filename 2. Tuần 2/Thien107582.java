package phamchithien.buoi2;

import java.util.Scanner;

public class Thien107582 {

    public static void main(String[] args) {
        int num1 = 10;
        double num2 = 5.5;
        System.out.println("Xin chao cac ban tan sinh vien lop IT24A");
        System.out.println("Xin chao cac ban tan sinh vien lop \"IT24A\"");
        System.out.println("Gia tri num1 la: " +num1);
        System.out.println("Gia tri num2 la: " +num2);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten lop: ");
        String lop = scanner.nextLine();

        System.out.println("Xin chao cac ban tan sinh vien");
        System.out.println("Lop: " +lop);

        System.out.println("Nhap so thu tu: ");
        String stt = scanner.nextLine();
        
        System.out.println("Nhap ho va ten: ");
        String hvt = scanner.nextLine();

        System.out.println("Nhap lop :");
        String lp = scanner.nextLine();

        System.out.println("So thu tu: " +stt);
        System.out.println("Ho va ten: " +hvt);
        System.out.println("Lop: " +lp);


        scanner.close();
        


    }
    
}
