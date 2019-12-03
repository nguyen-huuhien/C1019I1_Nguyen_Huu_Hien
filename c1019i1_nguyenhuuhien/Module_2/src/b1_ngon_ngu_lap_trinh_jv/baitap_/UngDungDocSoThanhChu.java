package b1_ngon_ngu_lap_trinh_jv.baitap_;

import java.util.Scanner;

public class UngDungDocSoThanhChu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cần đọc : ");
        int number = scanner.nextInt();

        if (number <= 10) {
            _0to10(number);
        }
        if (number > 10 && number <= 20) {
            _11to20(number);
        } 
        if (number > 20 && number<100) {
            _20to99(number);
        }
        if (number >= 100 && number < 1000) {
            _100to999(number);
        } else {
            System.out.println("nhap sai!");
        }

    }

    public static void _20to99(int number) {
        //21-99
        int num1 = number%10;
        int num10 = number%100/10;
        String string_num1;
        String string_num10 ;

        switch (num1) {
            case 0:
                string_num1 = "";
                break;
            case 1:
                string_num1 = "One";
                break;
            case 2:
                string_num1 = "Two";
                break;
            case 3:
                string_num1 = "Three";
                break;
            case 4:
                string_num1 = "Four";
                break;
            case 5:
                string_num1 = "Five";
                break;
            case 6:
                string_num1 = "Six";
                break;
            case 7:
                string_num1 = "Seven";
                break;
            case 8:
                string_num1 = "Eight";
                break;
            case 9:
                string_num1 = "Nine";
                break;
            default:
                string_num1 = " ";
        }

        switch (num10) {
            case 2:
                string_num10 = "Twenty";
                break;
            case 3:
                string_num10 = "Thirty";
                break;
            case 4:
                string_num10 = "Fourty";
                break;
            case 5:
                string_num10 = "Fifty";
                break;
            case 6:
                string_num10 = "Sixty";
                break;
            case 7:
                string_num10 = "Seventy";
                break;
            case 8:
                string_num10 = "Eighty";
                break;
            case 9:
                string_num10 = "Ninety";
                break;
            default:
                string_num10 = "";
        }
        System.out.println(string_num10+string_num1);
    }

    public static void _100to999(int number) {
        int num1 = number%10;
        int num10check = number%100;
        int num10 = number%100/10;
        int num100 = number/100;
        String string_num1;
        String string_num10 = null;
        String string_num100 = null;
        String hangChucVaDonVi = " " ;
        if (num10check > 20) {
            switch (num1) {
                case 0:
                    string_num1 = "";
                    break;
                case 1:
                    string_num1 = "One";
                    break;
                case 2:
                    string_num1 = "Two";
                    break;
                case 3:
                    string_num1 = "Three";
                    break;
                case 4:
                    string_num1 = "Four";
                    break;
                case 5:
                    string_num1 = "Five";
                    break;
                case 6:
                    string_num1 = "Six";
                    break;
                case 7:
                    string_num1 = "Seven";
                    break;
                case 8:
                    string_num1 = "Eight";
                    break;
                case 9:
                    string_num1 = "Nine";
                    break;
                default:
                    string_num1 = " ";
            }

            switch (num10) {
                case 2:
                    string_num10 = "Twenty";
                    break;
                case 3:
                    string_num10 = "Thirty";
                    break;
                case 4:
                    string_num10 = "Fourty";
                    break;
                case 5:
                    string_num10 = "Fifty";
                    break;
                case 6:
                    string_num10 = "Sixty";
                    break;
                case 7:
                    string_num10 = "Seventy";
                    break;
                case 8:
                    string_num10 = "Eighty";
                    break;
                case 9:
                    string_num10 = "Ninety";
                    break;
                default:
                    string_num10 = "";
            }
           hangChucVaDonVi = string_num10 +" " + string_num1;
        }

        else if (num10check <= 20 && num10check >= 10) {
            switch (num10check) {
                case 20:
                    hangChucVaDonVi += "Twenty";
                    break;
                case 19:
                    hangChucVaDonVi += "Nineteen";
                    break;
                case 18:
                    hangChucVaDonVi += "eighteen";
                    break;
                case 17:
                    hangChucVaDonVi += "Seventeen";
                    break;
                case 16:
                    hangChucVaDonVi += "Sixteen";
                    break;
                case 15:
                    hangChucVaDonVi += "Fifteen";
                    break;
                case 14:
                    hangChucVaDonVi += "Fourteen";
                    break;
                case 13:
                    hangChucVaDonVi += "Thirteen";
                    break;
                case 12:
                    hangChucVaDonVi += "Twelve";
                    break;
                case 11:
                    hangChucVaDonVi += "Eleven";
                    break;
                case 10:
                    hangChucVaDonVi += "Ten";
                    break;

            }
        }
        else if (num10check < 10 && num10check >= 00) {
            switch (num10check)   {
                case 0:
                    hangChucVaDonVi = "";
                    break;
                case 1:
                    hangChucVaDonVi = "One";
                    break;
                case 2:
                    hangChucVaDonVi = "Two";
                    break;
                case 3:
                    hangChucVaDonVi = "Three";
                    break;
                case 4:
                    hangChucVaDonVi = "Four";
                    break;
                case 5:
                    hangChucVaDonVi = "Five";
                    break;
                case 6:
                    hangChucVaDonVi = "Six";
                    break;
                case 7:
                    hangChucVaDonVi = "Seven";
                    break;
                case 8:
                    hangChucVaDonVi = "Eight";
                    break;
                case 9:
                    hangChucVaDonVi = "Nine";
                    break;
                default:
                    hangChucVaDonVi = " ";
            }
        }

        switch (num100) {
            case 0:
                string_num100 = "";
                break;
            case 1:
                string_num100 = "One Hundred";
                break;
            case 2:
                string_num100 = "Two Hundred";
                break;
            case 3:
                string_num100 = "Three Hundred";
                break;
            case 4:
                string_num100 = "Four Hundred";
                break;
            case 5:
                string_num100 = "Five Hundred";
                break;
            case 6:
                string_num100 = "Six Hundred";
                break;
            case 7:
                string_num100 = "Seven Hundred";
                break;
            case 8:
                string_num100 = "Eight Hundred";
                break;
            case 9:
                string_num100 = "Nine Hundred";
                break;

            default:
                string_num100 = " ";
        }


        System.out.println(string_num100 +" and " + hangChucVaDonVi  );

    }

    public static void _11to20(int number) {
        switch (number) {
            case 11:
                System.out.println("Eleven");
                break;
            case 12:
                System.out.println("Twelve");
                break;
            case 13:
                System.out.println("Thirteen");
                break;
            case 14:
                System.out.println("Fourteen");
                break;
            case 15:
                System.out.println("Fifteen");
                break;
            case 16:
                System.out.println("Sixteen");
                break;
            case 17:
                System.out.println("Seventeen");
                break;
            case 18:
                System.out.println("Eighteen");
                break;
            case 19:
                System.out.println("Nineteen");
                break;
            case 20:
                System.out.println("Twenty");
                break;
        }
    }

    public static void _0to10(int number) {
        switch (number) {
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
            case 10:
                System.out.println("Ten");
                break;
        }
    }
}
