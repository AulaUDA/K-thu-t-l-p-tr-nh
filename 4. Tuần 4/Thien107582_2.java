package phamchithien.buoi3;

    import java.util.Scanner;

public class Thien107582_2 {
    
    public static String gioiTinh(boolean gt){
        return gt? "Nam":"Nu";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap ma sinh vien: ");
        String maSV = scanner.nextLine();
        System.out.println("Nhap ho va ten: ");
        String hoVaTen = scanner.nextLine();
        System.out.println("Nhap ngay sinh (dd/mm/yyyy): ");
        String ngaySinh = scanner.nextLine();
        System.out.println("Nhap tuoi: ");
        int tuoi = scanner.nextInt();
        System.out.println("Nhap gioi tinh (1:Nam , 0: Nu): ");
        int gtInput = scanner.nextInt();
        boolean gt = (gtInput == 1);

        scanner.nextLine();

        System.out.println("Nhap Lop: ");
        String lop = scanner.nextLine();
        System.out.println("Nhap khoa: ");
        String khoa = scanner.nextLine();
        System.out.println("Nhap dia chi: ");
        String diaChi = scanner.nextLine();

        System.out.println("-----NHAP THONG TIN SINH VIEN-----");
        System.out.println("Ma sinh vien: " +maSV);
        System.out.println("Ho va ten: " +hoVaTen);
        System.out.println("Ngay sinh: " +ngaySinh);
        System.out.println("Tuoi: " +tuoi);
        System.out.println("Gioi tinh: " +gioiTinh(gt));
        System.out.println("Lop: " +lop);
        System.out.println("Khoa: " +khoa);
        System.out.println("Dia chi: " +diaChi);
        System.out.println("-----Het-----");

        scanner.close();


    }
}
