package b1_ngon_ngu_lap_trinh_jv.thuc_hanh;

import java.util.Scanner;

public class SuDungToanTu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float width;
        float height;

        System.out.println("Enter width : ");
        width = scanner.nextFloat();

        System.out.println("Enter height : ");
        height = scanner.nextFloat();

        float area = width*height;
        System.out.println("Area is : " + area);
    }
}
