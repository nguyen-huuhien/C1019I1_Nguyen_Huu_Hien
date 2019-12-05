package b1_ngon_ngu_lap_trinh_jv.baitap_;

import java.util.Scanner;

public class HienThiSoNguyenToNhoHon100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số giới hạn : ");

        int soNguyenToMax = scanner.nextInt();

        for (int j = 2; j <soNguyenToMax ; j++) {
            if (j < 2) {
                System.out.println(j + " is not a prime ");
            } else {
                int i=2;
                boolean check = true;
                while (i < Math.sqrt(j)) {
                    if (j % i == 0) {
                        check = false;
                        break;
                    }
                    i++;
                }
                if (check) {
                    System.out.print(j + " ");}
//                } else {
//                    System.out.println(i + " is not a prime");
//                }
            }

        }


    }
}
