package b2_MangVaPhuongThuc.BT.SuDungLopIllegalTriangleException;

import b2_MangVaPhuongThuc.BT.SuDungLopIllegalTriangleException.IllegalTriangleException;

import java.util.Scanner;
public class SuDungLopTriagleEx {
    public static void main(String[] args) throws IllegalTriangleException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap 3 canh cua tam giac: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a < 0 || b < 0 || c < 0 || a + b < c || a + c < b || b + c < a) {
            throw new IllegalTriangleException("loi");
        }
    }
}
