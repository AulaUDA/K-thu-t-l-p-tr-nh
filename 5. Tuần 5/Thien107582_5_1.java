package phamchithien.buoi5;

import java.util.Arrays;
import java.util.Scanner;

public class Thien107582_5_1 {


    public static void timPhanTuLonT2(int[] arr) {
        if (arr.length < 2) {
            System.out.println("Mang phai co it nhat 2 phan tu.");
            return;
        }
        
        int lonNhat = Integer.MIN_VALUE;
        int lonThu2 = Integer.MIN_VALUE;
        int chiSo = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > lonNhat) {
                lonThu2 = lonNhat;
                lonNhat = arr[i];
                chiSo = i;
            } else if (arr[i] > lonThu2 && arr[i] != lonNhat) {
                lonThu2 = arr[i];
            }
        }
        
        if (lonThu2 == Integer.MIN_VALUE) {
            System.out.println("khong co phan tu lon thu 2.");
        } else {
            System.out.println("phan tu lon thu 2: " + lonThu2 + ", chi so: " + chiSo);
        }
    }


    public static void mangGiamDan(int[] arr) {
        Arrays.sort(arr);

        for (int i = 0; i < arr.length / 2; i++) {
            int tam = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = tam;
        }
    }


    public static int[] chenSoGD(int[] arr, int x) {
        int[] newArr = new int[arr.length + 1];
        int i = 0;
        

        while (i < arr.length && arr[i] > x) {
            newArr[i] = arr[i];
            i++;
        }


        newArr[i] = x;


        while (i < arr.length) {
            newArr[i + 1] = arr[i];
            i++;
        }

        return newArr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        System.out.print("Nhap so luong phan tu cua mang: ");
        int n = scanner.nextInt();
        int[] A = new int[n];

        System.out.println("Nhap cac phan tu cua mang A (tu 1 den 99):");
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
            while (A[i] <= 0 || A[i] >= 100) {
                System.out.print("Phan tu phai lon hon 0 va nho hon 100. Nhap lai phan tu thu " + (i + 1) + ": ");
                A[i] = scanner.nextInt();
            }
        }


        timPhanTuLonT2(A);


        mangGiamDan(A);
        System.out.println("Mang sau khi sap xep giam dan: " + Arrays.toString(A));


        System.out.print("Nhap so nguyen x de chen vao mang: ");
        int x = scanner.nextInt();
        
        A = chenSoGD(A, x);
        System.out.println("Mang sau khi chen so " + x + ": " + Arrays.toString(A));
        
        scanner.close();
    }
}

