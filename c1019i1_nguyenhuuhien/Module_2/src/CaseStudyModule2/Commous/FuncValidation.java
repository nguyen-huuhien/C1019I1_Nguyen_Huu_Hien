package CaseStudyModule2.Commous;

import java.util.Scanner;

public class FuncValidation {
    private static String regex = "";
    private static Scanner sc;

    //check name Valid
    public static boolean checkNameSerVice(String str) {
        regex = "^(([\\p{Lu}][\\p{Ll}]+)|(([\\p{Lu}][\\p{Ll}]+)(\\s([\\p{Lu}][\\p{Ll}]+)){1,6}))$";
        return str.matches(regex);
    }

    //check Doule
    public static double checkValidNumberDouble(String content, String errMes) {
        while (true) {
            try {
                sc = new Scanner(System.in);
                System.out.println(content);
                return sc.nextDouble();
            } catch (Exception ex) {
                System.out.println(errMes);
            }
        }
    }

    //Check Interger
    public static Integer checkValidNumberInteger(String content, String errMes) {
        while (true) {
            try {
                sc = new Scanner(System.in);
                System.out.println(content);
                return sc.nextInt();
            } catch (Exception ex) {
                System.out.println(errMes);
            }
        }
    }

    //check Others Convenient
    public static boolean checkOthersConvenient(String str) {
        regex = "^(massage|karaoke|food|drink|car)$";
        return str.matches(regex);
    }

    //check birthday
    public static boolean checkBirthDay(String str) {
        regex = "^((0[1-9]|[1-2][0-9]|3[0-1])\\/(0[1-9]|1[0-2])\\/(19[0-9][0-9]|200[0-1]))$";
        return str.matches(regex);
    }

    //check Gender
    public static boolean checkGender(String string) {
        regex = "^(Male|Female|Unknown)$";
        return string.matches(regex);
    }
    //check Email
    public static boolean checkEmail(String str) {
        regex = "^(([a-zA-Z0-9_]{2,20})\\@([a-zA-Z0-9_]{4,10})(\\.(([a-zA-Z0-9_]){4,10})){1,5})$";
        return str.matches(regex);
    }


}
