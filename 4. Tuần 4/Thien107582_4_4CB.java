package phamchithien.buoi4;

public class Thien107582_4_4CB {
    public static void bai4_4(){
        int arr2[][] = {{1,2,3},{4,5,6},{7}};

        for (int i = 0; i < arr2.length; i++)
            for(int j = 0; j <arr2[i].length; j ++)
            {
                System.out.printf("arr2[%d][%d] = %d\n", i, j, arr2[i][j]);
            }
    }
    public static void main(String[] args) {
        bai4_4();
    }
}
