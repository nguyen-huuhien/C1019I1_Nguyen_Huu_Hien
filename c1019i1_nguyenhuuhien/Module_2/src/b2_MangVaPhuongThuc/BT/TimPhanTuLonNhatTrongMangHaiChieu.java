package b2_MangVaPhuongThuc.BT;

import java.util.Scanner;

public class TimPhanTuLonNhatTrongMangHaiChieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [][] matrix;
        System.out.println("Enter a row : ");
        int row = scanner.nextInt();
        System.out.println("Enter a collum : ");
        int collum = scanner.nextInt();

        matrix = new int[row][collum];

        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j <matrix[i].length ; j++) {
                System.out.println("Enter element :"+(i + 1 ) + " : " );
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Property list : ");
        System.out.println();
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j <matrix[i].length ; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        int indexRow = 1 ;
        int indexCollum = 1 ;
        int max = matrix[0][0];
        for (int i = 0; i <matrix.length ; i++) {
            indexRow = i+1;
            for (int j = 0; j <matrix[i].length ; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    indexCollum = j+1;
                }
            }
        }
        System.out.println("Giá trị lớn nhất trong mảng là : " + max + ", tại hàng "+ indexRow + ", tại cột" + indexCollum);



    }

}
