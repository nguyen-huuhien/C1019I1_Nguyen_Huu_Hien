package b2_MangVaPhuongThuc.TH;

import java.util.Scanner;

public class UngDungDemSoLuongSVThiDo {
    public static void main(String[] args) {
        //khai báo biến , nhập kích thước mảng
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size:");
            size = scanner.nextInt();
            if (size > 30)
                System.out.println("Size should not exceed 30");
        } while (size > 30);
        //nhập giá trị cho từng phần tử của mảng
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter a mark for student " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        //sử dụng vòng lặp để in ra danh sách vừa nhập, đồng thời đếm số lượng ssv thi đỗ.
        int count = 0;
        System.out.println("List of matk : ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
            if (array[j] >= 5 && array[j] <= 10)
                count++;
        }
        System.out.println("\n The number of students passing the exam is : "+ count);


    }
}
