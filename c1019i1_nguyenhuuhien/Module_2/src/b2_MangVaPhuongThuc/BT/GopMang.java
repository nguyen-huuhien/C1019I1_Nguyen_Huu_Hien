package b2_MangVaPhuongThuc.BT;

import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //nhập độ dài của 2 mảng
        System.out.println("Nhập độ dài của mảng 1 : ");
        int arr1size = scanner.nextInt();
        System.out.println("Nhập độ dài của mang 2 : ");
        int arr2size = scanner.nextInt();

        int []arr1 = new int[arr1size];
        int []arr2 = new int[arr2size];
        int []arr3 = new int[arr1size+arr2size];
        System.out.println("Nhập mảng 1 : ");

        for (int i = 0; i <arr1.length ; i++) {
            arr1[i] = scanner.nextInt();
        }
        System.out.println("Nhập mảng 2  : ");
        for (int i = 0; i <arr2.length ; i++) {
            arr2[i] = scanner.nextInt();
        }
        int d = 0;

        for (int i = 0; i <arr1size ; i++) {
            arr3[d] = arr1[i];
            d++;
        }
        for (int i = 0; i < arr2size; i++) {
            arr3[d] = arr2[i];
            d++;
        }
        System.out.print("Mảng 3 : ");
        for (int a :arr3) {
            System.out.print(a + " ");
        }
    }
}
