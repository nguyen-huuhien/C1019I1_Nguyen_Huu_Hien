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

        for (int i = 0; i <arr1.length ; i++) {
            arr1[i] = scanner.nextInt();
        }
        for (int i = 0; i <arr2.length ; i++) {
            arr2[i] = scanner.nextInt();
        }


    }
}
