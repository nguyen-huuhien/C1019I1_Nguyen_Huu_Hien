package b1_ngon_ngu_lap_trinh_jv.thuc_hanh;

import java.util.Scanner;

public class GiaiPhuongTrinhBacNhat {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as ' a * x + b = 0 ', Please enter constans :" );
        Scanner scanner = new Scanner(System.in);

        System.out.println("a : ");
        double a = scanner.nextDouble();
        System.out.println("b : ");
        double b = scanner.nextDouble();
        System.out.println("c : ");
        double c = scanner.nextDouble();

        if (a != 0) {
            double solution = -b / a;
            System.out.printf("The solution is : %f !", solution);
        } else if (a != 0) {
            double answer = (c - b) / a;
            System.out.printf("Equation pass with x = %f!\n", answer);
        }
        else {
            if (b == 0) {
                System.out.printf("The solution is all x!");
            } else {
                System.out.printf("No solution!");
            }
        }

    }
}
