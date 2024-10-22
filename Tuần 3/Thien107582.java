package phamchithien;
/**
 * Thien107582
 */
public class Thien107582 {

    public static String gioiTinh(boolean gt)
    {
        return gt?"Nam":"Nu";
    }

    public static void main(String[] args) {

        String maSV = "12345";
        String hoTen = "Nguyen Van A";
        String ngaySinh = "1/1/2006";
        int tuoi = 18;
        boolean gt = true;
        String lop = "IT24A";
        String khoa = "Cong nghe thong tin";
        String diaChi = "Da Nang";

        System.out.println("-----THONG TIN SINH VIEN-----");
        System.out.println("Ma sinh vien: " +maSV);
        System.out.println("Ho va ten: " +hoTen);
        System.out.println("Ngay sinh: " +ngaySinh);
        System.out.println("Tuoi: " +tuoi);
        System.out.println("Gioi tinh: " +gioiTinh(gt));
        System.out.println("Lop: " +lop);
        System.out.println("Khoa: " +khoa);
        System.out.println("Dia Chi: " +diaChi);
        System.out.println("-----HET-----");
        
    }
}