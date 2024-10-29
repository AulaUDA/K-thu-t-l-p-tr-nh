package phamchithien.buoi3;

public class Thien107582_1 {

    public static String gioiTinh(boolean gt){
        return gt? "Nam":"Nu";
    }
    public static void main(String[] args) {
        String maSV = "12345";
        String hoVaTen = "Nguyen Van An";
        String ngaySinh = "20/10/1990";
        int tuoi = 34;
        boolean gt = true;
        String lop = "IT24B";
        String khoa = "Cong nghe thong tin";
        String diaChi = "Da Nang";

        System.out.println("-----THONG TIN SINH VIEN-----");
        System.out.println("Ma sinh vien: " +maSV);
        System.out.println("Ho va ten: " +hoVaTen);
        System.out.println("Ngay sinh: " +ngaySinh);
        System.out.println("Tuoi: " +tuoi);
        System.out.println("Gioi tinh: " +gioiTinh(gt));
        System.out.println("Lop: " +lop);
        System.out.println("Khoa: " +khoa);
        System.out.println("Dia chi: " +diaChi);
        System.out.println("-----Het-----");

    }
}
