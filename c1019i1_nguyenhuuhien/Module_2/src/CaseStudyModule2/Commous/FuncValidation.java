package CaseStudyModule2.Commous;

import java.util.Scanner;

public class FuncValidation {
    private static String regex = "";
    private static Scanner sc;

    //check name Valid
    public static boolean checkNameSerVice(String str) {
        regex = "^(([\\p{Lu}][\\p{Ll}]+)|(([\\p{Lu}][\\p{Ll}]+)(\\s([\\p{Lu}][\\p{Ll}]+)){1,6}))$";
        return  str.matches(regex);
    }

    //check Doule
    public static double checkValidNumberDouble(String content, String errMes) {
        while (true) {
            try {
                sc = new Scanner(System.in);
                System.out.println(content);
                return sc.nextDouble();
            } catch (Exception ex) {
                System.out.println(errMes  );
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
                System.out.println(errMes );
            }
        }
    }

    //check Others Convenient
    public static boolean checkOthersConvenient(String str) {
        regex = "^(massage|karaoke|food|drink|car)$";
        return str.matches(regex);
    }







}
