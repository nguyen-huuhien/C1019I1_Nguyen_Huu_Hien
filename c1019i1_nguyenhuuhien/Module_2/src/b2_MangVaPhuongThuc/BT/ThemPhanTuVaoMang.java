package b2_MangVaPhuongThuc.BT;

import java.util.Scanner;
public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap kich thuoc cua mang: ");
        size = scanner.nextInt();
        array = new int[size +1];
        int i = 0;
        while (i < (size)) {
            System.out.print("Nhap vao vi tri thu " + (i + 1) + " : ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.println("Phan tu trong mang la: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        System.out.println();
        System.out.print("Nhap so can chen: ");
        int X = scanner.nextInt();
        System.out.print("Chon vi tri can chen: ");
        int k = scanner.nextInt();
        if (k < 0 || k > array.length - 1) {
            System.out.println("Khong the nhap vao vi tri nay!!!");
        } else {
            for (int j = array.length - 1; j > k; j--) {
                array[j] = array[j - 1];
            }
        }
        array[k] = X;
        System.out.println("Mang sau khi them vao la: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}