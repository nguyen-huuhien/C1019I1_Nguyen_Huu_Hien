package b2_MangVaPhuongThuc.BT;

import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        int []arr = {1,2,3,3,4,5,6,7,8,9,55,44,11,22,33,77,66,88,99,22};
        System.out.println("Mảng có các phần tử như sau :");
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập giá trị cần xóa :");
        int valueToDelete = scanner.nextInt();
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] == valueToDelete) {
                arr[i] = arr[i+1];
               for (int j=i+1;j<arr.length-1;j++) {
                   arr[j]=arr[j+1];
               }
               arr[arr.length-1]=0;
               i--;
            }
        }

        System.out.println("Mảng có các phần tử như sau :");
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
