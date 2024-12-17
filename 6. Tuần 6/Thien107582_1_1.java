package phamchithien.buoi6;

public class Thien107582_1_1 {
    public static void main(String[] args) {
        // Trường hợp 1
        String hoTen1 = "Nguyễn Văn An";
        String ngaySinh1 = "20/10/2006";
        String diemTongKet1 = "5.5";
        String tuoi1 = "18";
        
        float diemTongKet1Float = Float.parseFloat(diemTongKet1);  // Chuyển String sang float
        int tuoi1Int = Integer.parseInt(tuoi1);                     // Chuyển String sang int
        
        System.out.println("-----THÔNG TIN SINH VIÊN-----");
        System.out.println("Họ và tên: " + hoTen1 + " (String)");
        System.out.println("Ngày sinh: " + ngaySinh1 + " (String)");
        System.out.println("Điểm tổng kết: " + diemTongKet1Float + " (Float)");
        System.out.println("Tuổi: " + tuoi1Int + " (Int)");
        System.out.println("-----HẾT-----");

        // Trường hợp 2
        String hoTen2 = "Nguyễn Văn An";
        String ngaySinh2 = "20/10/2006";
        Float diemTongKet2 = 5.5f;
        int tuoi2 = 18;

        System.out.println("-----THÔNG TIN SINH VIÊN-----");
        System.out.println("Họ và tên: " + hoTen2 + " (String)");
        System.out.println("Ngày sinh: " + ngaySinh2 + " (String)");
        System.out.println("Điểm tổng kết: " + diemTongKet2 + " (String)");
        System.out.println("Tuổi: " + tuoi2 + " (String)");
        System.out.println("-----HẾT-----");
    }
}
