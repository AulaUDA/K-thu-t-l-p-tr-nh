package phamchithien.buoi4;

public class Thien107582_4_3CB {
    public static void bai4_3() {
        int arr1[][] = new int[2][3];
        
        int value = 1;
        for (int i = 0; i <arr1.length; i ++)
            for (int j = 0; j <arr1[i].length; j++){
            arr1[i][j] = value;
            value++;
            }

        for (int i = 0; i <arr1.length; i++){
            for (int j =0; j <arr1[i].length; j++){
                System.out.printf("arr1[%d][%d] = %d\n", i, j, arr1[i][j]);

            }
        }

    }
            
    
    public static void main(String[] args) {
        bai4_3();
    }
}
