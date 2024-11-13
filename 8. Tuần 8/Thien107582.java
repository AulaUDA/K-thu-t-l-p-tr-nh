package phamchithien.buoi8;

public class Thien107582 {

    public static void tamGiacVuongKyTu(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void tamGiacVuongNguocKyTu(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void tamGiacVuongSo(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void tamGiacVuongNguocSo(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void kimTuThapKyTu(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void kimTuThapSo(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int k = i; k >= 1; k--) {
                System.out.print(k);
            }
            for (int l = 2; l <= i; l++) {
                System.out.print(l);
            }
            System.out.println();
        }
    }
    public static void kimTuThapNguocKyTu(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 5;
    
        System.out.println("Tam giac vuong voi dau '*':");
        tamGiacVuongKyTu(n);
    
        System.out.println("Tam giac vuong nguoc voi dau '*':");
        tamGiacVuongNguocKyTu(n);
    
        System.out.println("Tam giac vuong voi cac so:");
        tamGiacVuongSo(n);
    
        System.out.println("Tam giac vuong nguoc voi cac so:");
        tamGiacVuongNguocSo(n);
    
        System.out.println("Kim tu thap voi dau '*':");
        kimTuThapKyTu(n);
    
        System.out.println("Kim tu thap voi cac so:");
        kimTuThapSo(n);
    
        System.out.println("Kim tu thap nguoc voi dau '*':");
        kimTuThapNguocKyTu(n);
    }
    
    
    
}