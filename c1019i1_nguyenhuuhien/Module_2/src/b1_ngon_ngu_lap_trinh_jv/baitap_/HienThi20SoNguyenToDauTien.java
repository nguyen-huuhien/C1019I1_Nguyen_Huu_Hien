package b1_ngon_ngu_lap_trinh_jv.baitap_;

import java.util.Scanner;

public class HienThi20SoNguyenToDauTien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập lượng số nguyên cần in ra : ");
        int numbersPrimeneed = scanner.nextInt();
        int n = 2;
        int count = 0;
        while (count < numbersPrimeneed) {
            int i=2;
            boolean check = true;
            while (i < Math.sqrt(n)) {
                if (n % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                System.out.println(n + " ");
                count++;
            }
            n++;

        }




    }
}