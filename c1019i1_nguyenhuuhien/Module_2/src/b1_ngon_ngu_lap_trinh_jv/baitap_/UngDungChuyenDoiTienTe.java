package b1_ngon_ngu_lap_trinh_jv.baitap_;

import java.util.Scanner;

public class UngDungChuyenDoiTienTe {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Chọn phương thúc đổi :");
        System.out.println("1. USD - VN ");
        System.out.println("2. VN - USD ");
        int choose = scanner.nextInt();

        switch (choose) {
            case 1:
                System.out.println("Nhập số tiền cần đổi : ");
                double money = scanner.nextDouble();
                double result = money * 23000;
                System.out.printf("%f $ = %f VND",money , result);
                break;
            case 2:
                System.out.println("Nhập số tiền cần đổi : ");
                 money = scanner.nextDouble();
                 result = money / 23000;
                System.out.printf("%f VND = %f $",money , result);
                break;
        }

    }
}
