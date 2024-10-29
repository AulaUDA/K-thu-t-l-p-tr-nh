package phamchithien.buoi4;

public class Thien107582_4_3CB {
    public static void bai4_3() {
        int arr1[][] = new int[2][3];
        int i = 0, j = 0;// Khai báo chỉ số để duyệt qua mảng
        System.out.printf("Phan tu thu nhat arr1[%d][%d]", i, j);
        System.out.printf("\nPhan tu thu hai arr1[%d][%d]", i, j = j + 1);
        System.out.printf("\nPhan tu thu ba arr1[%d][%d]", i, j = j + 1);
        System.out.printf("\nPhan tu thu tu arr1[%d][%d]", i = i + 1, j = 0);
        System.out.printf("\nPhan tu thu nam arr1[%d][%d]", i, j = j + 1);
        System.out.printf("\nPhan tu thu sau arr1[%d][%d]", i, j = j + 1);
    }
    
    public static void main(String[] args) {
        bai4_3();
    }
}
