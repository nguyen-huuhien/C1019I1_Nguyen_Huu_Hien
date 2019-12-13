package b5_AdvancedObjectOrientedDesign.TH.TrienKhaiInterfaceComparable;


import java.util.Arrays;

public class ComparableCircleTest {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(3.4);
        circles[1] = new ComparableCircle();
        circles[2] = new ComparableCircle("xanh",false , 5 ) ;
        System.out.println("pre - sorted : ");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }
        Arrays.sort(circles);

        System.out.println("Ater - sorted : ");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }

    }
}
