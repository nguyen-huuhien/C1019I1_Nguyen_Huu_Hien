package b4_keThua.bt.LopCircleVaLopCylinder;

import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập radius");
        double radius  = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("color :");
        String color = scanner.nextLine();

        System.out.println("Nhập hight");
        double hight = scanner.nextDouble();


        Cylinder cylinder= new Cylinder(radius , color, hight);
        System.out.println(cylinder);
    }


}
