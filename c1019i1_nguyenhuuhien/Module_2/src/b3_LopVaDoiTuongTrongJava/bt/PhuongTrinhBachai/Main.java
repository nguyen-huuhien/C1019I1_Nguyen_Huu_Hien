package b3_LopVaDoiTuongTrongJava.bt.PhuongTrinhBachai;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập giá trị a :");
        double a = scanner.nextDouble();
        System.out.println("Nhập giá trị b :");
        double b = scanner.nextDouble();
        System.out.println("Nhập giá trị c :");
        double c = scanner.nextDouble();

       QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);

        if (quadraticEquation.getDiscriminant() > 0) {
            System.out.println("Nghiệm 1 là  " + quadraticEquation.getRoot1()
            + "\n" + "Nghiệm 2 là : " + quadraticEquation.getRoot2());
        } else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.println("Pt có 1 nghiệm kép là : " + quadraticEquation.getRoot1());
        } else {
            System.out.println("The equation has no roots");
        }
    }
}
