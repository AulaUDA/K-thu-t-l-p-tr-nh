package phamchithien.buoi4;

import java.util.Scanner;

public class Thien107582_3NC {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       
       System.out.println("Nhap mot so nguyen: ");
       int n = scanner.nextInt();

       for (int i = 1; i <= n; i ++){
        if (i % 2 !=0) {

            System.out.println(i + " ");
            
        }
       }
       scanner.close();
    }
    
}
