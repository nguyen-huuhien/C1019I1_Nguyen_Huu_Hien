package b1_ngon_ngu_lap_trinh_jv.thuc_hanh;

import java.util.Scanner;

public class TimUocChungLonNhat {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
         int a, b;
        System.out.println("Enter a : ");
        a = nhap.nextInt();
        System.out.println("Enter b : ");
        b = nhap.nextInt();

        a=Math.abs(a);
        b=Math.abs(b);

        if (a == 0 || b == 0)
            System.out.println("No greatest common factor");
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        System.out.println("Greatest common factor: " + a);


    }
}
